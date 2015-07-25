(ns webinar.components.example8
  (:require [reagent.core :as reagent]
            [webinar.components.base-example :as base-example]))


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(defn on-click [num-clicks messages]
  (swap! num-clicks inc)
  (swap! messages conj (str @num-clicks " clicks!"))
  (when (= @num-clicks 10)
    (swap! messages conj "Done!")))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(defn component []
  (let [messages (reagent/atom ["Click the button ten times!"])
        num-clicks (reagent/atom 0)]
    (fn []
      (let [buttons [^{:key "reagent-ex8-button"} [:button {:id "reagent-ex8-button" :on-click #(on-click num-clicks messages) :disabled (>= @num-clicks 10)} "Click me"]]]
        [base-example/component "reagent-ex8" "Reagent Example 8" buttons messages]))))
