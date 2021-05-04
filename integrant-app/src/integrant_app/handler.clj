(ns integrant-app.handler
  (:require
   [integrant.core :as ig]
   [ring.util.response :as response]))

(defn hello-world [_]
  (response/response "Hello, World!"))

(defmethod ig/init-key ::app [_ _]
  hello-world)
