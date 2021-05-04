(ns dev
  (:require
   [clojure.java.io :as io]
   [clojure.repl :refer :all]
   [clojure.spec.alpha :as s]
   [clojure.tools.namespace.repl :refer [refresh]]
   [com.stuartsierra.component :as component]
   [com.stuartsierra.component.repl :refer [reset set-init start stop system]]))

(clojure.tools.namespace.repl/set-refresh-dirs "dev/src" "src" "test")
