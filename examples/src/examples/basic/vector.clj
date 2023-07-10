(ns examples.basic.vector)


(println "\nVector: \n")

;; 
;; VECTOR (ARRAY): 
;; 
;; Vectors are another data structure in Clojure, which are similar to arrays in other programming languages. 
;; Vectors are also immutable but provide efficient random access by index. 
;; They are created using square brackets or the vector function.
;; 
;; Syntax: 
;;         1. [elem1 elem2 ...]
;; Example: 
;;         1. (def my-vector [1 2 3]) ;; by using square brackets
;;         2. (def my-vector (vector 1 2 3)) ;; by using vector
;; 
;; Create (Add an element):
;; Use the conj function to add an element to the end of the array.
;; For example, (def my-array (conj my-array new-element)) adds new-element to the end of the array/vector.

;; Read (Access an element):
;; Use the get function to access an element at a specific index in the array.
;; For example, (get my-array index) retrieves the element at the given index.

;; Update (Modify an element):
;; Since Clojure's arrays/vectors are immutable, you cannot directly modify an element in-place.
;; Instead, you can create a new array/vector with the desired modification using functions like assoc, update, or replace.
;; For example, (def updated-array (assoc my-array index new-value)) creates a new array/vector with new-value at the given index.

;; Delete (Remove an element):
;; Use functions like subvec or filter to create a new array/vector that excludes the element(s) to be deleted.
;; For example, (def new-array (subvec my-array 0 index)) creates a new array/vector that excludes elements from index 0 to index - 1.

;; Create an array/vector
(def my-array [1 2 3 4 5])

(println "Original array:" my-array)

;; Create (Add an element)
(def new-array (conj my-array 6))

;; Read (Access an element)
(let [element (get my-array 2)]
  (println "Element at index 2:" element))

;; Update (Modify an element)
(def updated-array (assoc my-array 3 10))

;; Delete (Remove an element)
(def deleted-array (subvec my-array 0 2))


;; Explanation:

;; Array (Vector):
;;    - We create an array/vector `my-array` with elements 1, 2, 3, 4, 5.
;;    - We create new array/vector `new-array` from existing array by adding an new element.
;;    - The `(get my-array 2)` expression retrieves the element at index 2 (3).
;;    - The `(assoc my-array 3 10)` expression updates the element at index 2 to 10, creating a new updated vector.
;;    - The `(subvec my-array 0 2)` expression creates new vector (namely: deleted-array) by excluding the element from position from 0 to 1 (2 - 1 or index - 1).

(println "New array after create operation:" new-array)
(println "Updated array after update operation:" updated-array)
(println "Array after delete operation:" deleted-array)

;; TODO: Add vector methods with examaples like nth, conj, assoc, subvec and etc..

(println "__________________________________________________________")