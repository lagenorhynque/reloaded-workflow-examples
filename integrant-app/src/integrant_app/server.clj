(ns integrant-app.server
  (:require
   [integrant.core :as ig]
   [ring.adapter.jetty :as jetty]))

(defmethod ig/init-key ::server [_ {:keys [app options]}]
  (jetty/run-jetty app options))

(defmethod ig/halt-key! ::server [_ server]
  (.stop server))
