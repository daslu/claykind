(ns scicloj.claykind.api-test
  (:require [clojure.test :refer :all]
            [scicloj.claykind.api :as note-kinds]))

(deftest notebook-test
  (is (note-kinds/notebook "notebooks/test/basic.clj")))

(deftest all-notebooks-test
  (is (seq (note-kinds/all-notebooks))))
