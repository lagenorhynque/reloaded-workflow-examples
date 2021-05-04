(ns mount-app.server
  (:require
   [mount-app.config :as config]
   [mount-app.handler :as handler]
   [mount.core :refer [defstate]]
   [ring.adapter.jetty :as jetty]))

(defstate server
  :start (jetty/run-jetty handler/app (-> config/env :server :options))
  :stop (.stop server))
