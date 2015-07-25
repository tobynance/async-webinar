(ns webinar.animation
  (:require-macros [cljs.core.async.macros :refer [go]])
  (:require [goog.events :as events]
            [reagent.core :as reagent]
            [webinar.components.example1 :as example1]
            [webinar.components.example6 :as example6]
            [webinar.components.example8 :as example8]
            [goog.dom.classes :as classes])
  (:import [goog.events EventType]))

(enable-console-print!)

;; =============================================================================
;; Utilities

(defn by-id
  "Short-hand for document.getElementById(id)"
  [id]
  (.getElementById js/document id))

(defn reagent-examples []
  [:div
   [example1/component]
   [example6/component]
   [example8/component]])

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(defn ^:export run []
  (reagent/render [reagent-examples]
                  (.getElementById js/document "reagent")))
