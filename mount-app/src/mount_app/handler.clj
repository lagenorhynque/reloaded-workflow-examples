(ns mount-app.handler
  (:require
   [mount.core :refer [defstate]]
   [ring.util.response :as response]))

(defn hello-world [_]
  (response/response "Hello, World!"))

(defstate app
  :start hello-world)
