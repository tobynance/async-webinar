(ns webinar.components.base-example
  (:require [reagent.core :as reagent]))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(defn component [id label buttons messages]
  [:div {:id id :class "example"}
   [:h2 label]
   [:table
    [:tr
     [:td {:class "left"}
      (for [button buttons]
        button)
     [:td {:id (str id "-display") :class "display"}
      [:div {:class "scrolling"}
       [:div {:id (str id "-messages")}
        (for [[i message] (map-indexed vector @messages)]
          ^{:key i} [:p message])]]]]]]])
