(ns machine-learning.core (:gen-class))
(use 'incanter.core 'incanter.io)

(defn m
  "Number of examples of a collection"
  [x]
  (count (:rows x))
)


(defn -main
  "Entry point"
  []
  (read-dataset "resources/ex1data1.txt")
)
