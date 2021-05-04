(ns integrant-app.core
  (:gen-class)
  (:require
   [integrant-app.handler :as handler]
   [integrant-app.server :as server]
   [integrant.core :as ig]))

(def config
  {::handler/app {}
   ::server/server {:app (ig/ref ::handler/app)
                    :options {:port 3000
                              :join? false}}})

(defn -main [& _]
  (-> config
      ig/prep
      ig/init))
