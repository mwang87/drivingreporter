(ns drivingreporter.App
;;   (:use [quackvision.opencvutils])
;; ;  (:use [quackvision.utils])
  (:gen-class)
  (:import
   org.opencv.core.Core
   org.opencv.core.Mat
   org.opencv.core.MatOfRect
   org.opencv.core.Point
   org.opencv.core.Rect
   org.opencv.core.Scalar
   org.opencv.highgui.Highgui
   org.opencv.objdetect.CascadeClassifier))


(use 'drivingreporter.utils)

(defn -main []
  (println "hello world!"))
