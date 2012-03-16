(ns noir-toy.views.task
    (:require [noir-toy.views.common :as common])
    (:use [noir.core :only [defpage defpartial]]
          [hiccup.form-helpers :only [label text-field form-to]])
)

(defpage "/item" []
  (common/layout
    (form-to [:post "/item"] 
      (label "description" "Description:")
      (text-field "description"))))
