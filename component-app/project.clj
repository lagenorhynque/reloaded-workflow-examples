(defproject component-app "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[com.stuartsierra/component "1.0.0"]
                 [org.clojure/clojure "1.10.3"]
                 [ring/ring-core "1.9.3"]
                 [ring/ring-jetty-adapter "1.9.3"]]
  :main ^:skip-aot component-app.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}
             :dev {:source-paths ["dev/src"]
                   :resource-paths ["dev/resources"]
                   :dependencies [[com.stuartsierra/component.repl "0.2.0"]]}
             :repl {:repl-options {:init-ns user}}})
