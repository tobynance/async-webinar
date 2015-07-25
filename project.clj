(defproject webinar "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "0.0-3308"]
                 [reagent "0.5.0"]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]]

  :plugins [[lein-cljsbuild "1.0.6"]]

  :source-paths ["src"]

  :cljsbuild {
    :builds [{:id "webinar"
              :source-paths ["src"]
              :compiler {
                :output-to "js/webinar.js"
                :output-dir "js/out"
                :optimizations :none
                :source-map true}}]})
