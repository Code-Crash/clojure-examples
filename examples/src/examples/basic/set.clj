(ns examples.basic.set)

(println "\n#################### Set #################### \n")

;;
;; SET:
;;
;; Sets are unordered collections of unique elements in Clojure.
;; They are created using the `#{}` syntax or the `hash-set` function.
;;
;; Syntax:
;;         1. #{elem1 elem2 ...}
;; Example:
;;         1. (def my-set #{1 2 3})          ;; using #{} syntax
;;         2. (def my-set (hash-set 1 2 3))  ;; using hash-set function
;;
;; Create (Add an element):
;; Use the `conj` function to add an element to the set.
;; For example, `(def new-set (conj my-set new-element))` adds `new-element` to the set.
;;
;; Read (Access an element):
;; Sets in Clojure are not indexable since they are unordered.
;; However, you can use the `contains?` function to check if an element is present in the set.
;; For example, `(contains? my-set element)` checks if `element` is present in the set.
;;
;; Delete (Remove an element):
;; Use the `disj` function to remove an element from the set.
;; For example, `(def new-set (disj my-set element))` removes `element` from the set.
;;

;; Create a set
(def my-set #{1 2 3 4 5})

(println "Original set:" my-set)

;; Create (Add an element)
(def new-set (conj my-set 6))

;; Read (Access an element)
(let [element 2]
  (println "Is element 2 in the set?" (contains? my-set element)))

;; Delete (Remove an element)
(def deleted-set (disj my-set 4))

;; Explanation:

;; Set:
;;   - We create a set `my-set` with elements 1, 2, 3, 4, 5.
;;   - We create a new set `new-set` by adding a new element.
;;   - The `(contains? my-set element)` expression checks if `element` is present in the set.
;;   - The `(disj my-set 4)` expression removes the element 4 from the set, creating a new set `deleted-set`.

(println "New set after create operation:" new-set)
(println "Set contains element 2?:" (contains? my-set 2))
(println "Set after delete operation:" deleted-set)

;; TODO: Add set methods with examples like union, intersection, difference, and etc..

(println "__________________________________________________________")
