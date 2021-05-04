(ns dev
  (:require
   [clojure.java.io :as io]
   [clojure.repl :refer :all]
   [clojure.spec.alpha :as s]
   [clojure.tools.namespace.repl :refer [refresh]]
   [integrant-app.core]
   [integrant.core :as ig]
   [integrant.repl :refer [clear halt go init prep reset]]
   [integrant.repl.state :refer [config system]]))

(clojure.tools.namespace.repl/set-refresh-dirs "dev/src" "src" "test")

(integrant.repl/set-prep! (comp ig/prep (constantly integrant-app.core/config)))
