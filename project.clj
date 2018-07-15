(defproject orb-ping-demo "0.1.0-SNAPSHOT"
  :description "Demo orb for Auriga"
  :url "https://github.com/AurigaDiscord/orb-ping-demo-clj"
  :license {:name "The MIT License"
            :url "https://opensource.org/licenses/MIT"}

  :repositories [["jitpack" "https://jitpack.io"]]

  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.github.AurigaDiscord/orb-framework-clojure "0.1.1"]]

  :main ^:skip-aot orb-ping-demo.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
