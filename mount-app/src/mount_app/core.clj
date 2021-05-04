(ns mount-app.core
  (:gen-class)
  (:require
   [mount-app.server]
   [mount.core :as mount]))

(defn -main [& _]
  (mount/start))
