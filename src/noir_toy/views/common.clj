(ns noir-toy.views.common
  (:use [noir.core :only [defpartial]]
        [hiccup.page-helpers :only [include-css include-js html5]]))

(defpartial layout [& content]
            (html5
              [:head
               [:title "noir-toy!"]
               (include-js "//ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js")
               (include-css "/css/reset.css")]
              [:body
               [:div#wrapper
                content]]))
