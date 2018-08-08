(defproject shadow-cljs/launcher "1.2.0"
  :description "CLJS development tools"
  :url "https://github.com/thheller/shadow-cljs"
  :dependencies
  [[org.clojure/clojure "1.9.0"]
   [com.cemerick/pomegranate "1.0.0"]
   [org.slf4j/slf4j-nop "1.7.25"]]

  :source-paths
  ["src/main"]

  :profiles
  {:uberjar
   {:aot [shadow.cljs.launcher.deps]
    :main shadow.cljs.launcher.deps}})
