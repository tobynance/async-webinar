(ns webinar.components.example1
  (:require [reagent.core :as reagent]
            [webinar.components.base-example :as base-example]))


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(defn component []
  (let [messages (reagent/atom ["Waiting for a click ..."])
        buttons [^{:key "reagent-ex1-button"} [:button {:id "reagent-ex1-button" :on-click #(swap! messages conj "Got a click!")} "Click me"]]]
    [base-example/component "reagent-ex1" "Reagent Example 1" buttons messages]))
