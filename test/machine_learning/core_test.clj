(ns machine-learning.core-test
  (:use clojure.test midje.sweet machine-learning.core incanter.core incanter.io))

(facts "about linear regression"
  (fact "m captures the number of rows"
    (m (read-dataset "resources/ex1data1.txt")) => 97)
  (fact "m works with empty datasets"
    (m (read-dataset "empty")) => 0
      (provided (read-dataset "empty") => []))
)
