(ns component-app.handler
  (:require
   [com.stuartsierra.component :as component]
   [ring.util.response :as response]))

(defn hello-world [_]
  (response/response "Hello, World!"))

(defrecord App
  [handler]
  component/Lifecycle
  (start [this]
    (assoc this :handler hello-world))
  (stop [this]
    this))
