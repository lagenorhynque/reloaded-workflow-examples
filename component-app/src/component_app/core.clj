(ns component-app.core
  (:gen-class)
  (:require
   [com.stuartsierra.component :as component]
   [component-app.handler :as handler]
   [component-app.server :as server]))

(defn init-system [{:keys [server]}]
  (component/system-map
   :app (handler/map->App {})
   :server (component/using (server/map->Server
                             (assoc server
                                    :options {:port 3000
                                              :join? false}))
                            [:app])))

(defn -main [& _]
  (component/start (init-system nil)))
