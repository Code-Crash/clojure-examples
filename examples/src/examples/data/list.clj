(ns examples.data.list)
;; 
;; List 
;; 
;; Create (Add an element):
;; Use the cons function to add an element to the beginning of the list.
;; For example, (def my-list (cons new-element my-list)) adds new-element to the beginning of the list.

;; Read (Access an element):
;; Use the nth function to access an element at a specific index in the list.
;; For example, (nth my-list index) retrieves the element at the given index.

;; Update (Modify an element):
;; Since Clojure lists are immutable, you cannot directly modify an element in-place.
;; Instead, you can create a new list with the desired modification using functions like replace, assoc, or map.
;; For example, (def updated-list (replace {index new-value} my-list)) creates a new list with new-value at the given index.

;; Delete (Remove an element):
;; Use functions like sublist or filter to create a new list that excludes the element(s) to be deleted.
;; For example, (def new-list (filter #(not= % element-to-delete) my-list)) creates a new list that excludes element-to-delete.

;; Create a list
(def my-list '(1 2 3 4 5))

;; Create (Add an element)
(def new-list (cons 6 my-list))

;; Read (Access an element)
(let [element (nth my-list 3)]
  (println "Element at index 3:" element))

;; Update (Modify an element)
(def updated-list (replace {3 10} my-list))

;; Delete (Remove an element)
(def deleted-list (filter #(not= % 2) my-list))


;; Explanation:

;; List:
;;    - We create a list `my-list` with elements 1, 2, 3, 4, 5.
;;    - We create a new list `new-list` with elements 1, 2, 3, 4, 5, 6 by adding new element 6 in it.
;;    - The `(nth my-list 3)` expression retrieves the element at index 3 (4).
;;    - The `(replace {3 10} my-list)` expression will replace the element at index 3 with value 10 and store in updated-list.
;;    - The `(filter #(not= % 2)` expression filter the element list which does not contains the given value and return new list which we can store (ex: deleted-list).

(println "Original list:" my-list)
(println "New list after create operation:" new-list)
(println "Updated list after update operation:" updated-list)
(println "List after delete operation:" deleted-list)
(println "__________________________________________________________")
