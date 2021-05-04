(ns mount-app.config
  (:require
   [mount.core :refer [defstate]]))

(defstate env
  :start {:server {:options {:port 3000
                             :join? false}}})
