(ns orb-ping-demo.core
  (:gen-class)
  (:require [orb-framework.core    :as orb]
            [orb-framework.message :as orb-msg]))

(defn handler
  [{:keys [channel_id content] :as msg}]
  (if (= content "ping")
    (orb-msg/text channel_id "pong")))

(defn -main
  [& args]
  (orb/run "ping-demo" handler))
