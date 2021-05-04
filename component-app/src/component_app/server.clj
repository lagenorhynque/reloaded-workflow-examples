(ns component-app.server
  (:require
   [com.stuartsierra.component :as component]
   [ring.adapter.jetty :as jetty]))

(defrecord Server
  [instance app options]
  component/Lifecycle
  (start [this]
    (cond-> this
      (not instance) (assoc :instance (jetty/run-jetty (:handler app) options))))
  (stop [this]
    (when instance
      (.stop instance))
    (assoc this :instance nil)))
