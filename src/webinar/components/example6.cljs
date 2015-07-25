(ns webinar.components.example6
  (:require [reagent.core :as reagent]
            [goog.events :as events]
            [goog.events.EventType :as EventType]
            [webinar.components.base-example :as base-example]))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(defn- on-mouse-move [event is-on messages]
  (when @is-on
    (let [x (.-clientX event)
          y (.-clientY event)]
      (swap! messages conj (str "[" x ", " y "]")))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(defn component []
  (let [messages (reagent/atom ["Waiting for a click ..."])
        is-on (reagent/atom false)]
    (fn []
      (let [buttons [^{:key "reagent-ex6-button"} [:button {:id "reagent-ex6-button" :on-click (fn [] (swap! is-on not) nil)} (if @is-on "STOP!" "GO!")]]]
        (events/listen js/window EventType/MOUSEMOVE #(on-mouse-move % is-on messages))
        [base-example/component "reagent-ex6" "Reagent Example 6" buttons messages]))))
