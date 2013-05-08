(defproject script-builder "SNAPSHOT"
  :description "Just cljs builder env"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :plugins [[lein-cljsbuild "0.3.0"]]
  :cljsbuild {
              :builds [{
              :source-paths ["../main/static/cljs"]
              :compiler {
                  :output-to "../main/static/js/main.js"
                  :optimizations :whitespace
                  :pretty-print true}}]})          
