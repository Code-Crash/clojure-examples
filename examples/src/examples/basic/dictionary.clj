(ns examples.basic.dictionary)


(println "\nMap: \n")

;; 
;; Map (Dictionary): 
;; 
;; Dictionaries, also known as maps, are key-value pairs used to store and retrieve values based on unique keys. 
;; In Clojure, dictionaries are implemented as hash maps. 
;; They are created using curly braces or the hash-map function.
;; 
;; Syntax: 
;;         1. {key1 val1 key2 val2 ...}
;; Example: 
;;         1. (def my-map {:name "Alice", :age 30}) ;; by using key/pair value
;;         2. (def my-map (hash-map :name "Alice" :age 30)) ;; by using hash-map
;; 
;; Create (Add a key-value pair):
;; Use the assoc function to add a new key-value pair to the dictionary.
;; For example, (def my-dictionary (assoc my-dictionary :new-key new-value)) adds a new key-value pair :new-key new-value to the dictionary.

;; Read (Access a value):
;; Use the get function to retrieve the value associated with a specific key in the dictionary.
;; For example, (get my-dictionary :key) retrieves the value associated with :key.

;; Update (Modify a value):
;; Since Clojure dictionaries are immutable, you cannot directly modify a value in-place.
;; Instead, you can create a new dictionary with the desired modification using assoc.
;; For example, (def updated-dictionary (assoc my-dictionary :key new-value)) creates a new dictionary with the value associated with :key updated to new-value.

;; Delete (Remove a key-value pair):

;; Use the dissoc function to create a new dictionary that excludes a specific key and its associated value.
;; For example, (def new-dictionary (dissoc my-dictionary :key-to-delete)) creates a new dictionary without the :key-to-delete and its associated value.

(def my-dictionary {:name "John" :age 30 :city "New York"})

(println "Original dictionary:" my-dictionary)

;; Create (Add a key-value pair)
(def new-dictionary (assoc my-dictionary :occupation "Engineer"))

;; Read (Access a value)
(let [age (get my-dictionary :age)]
  (println "Age:" age))

;; Update (Modify a value)
(def updated-dictionary (assoc my-dictionary :age 35))

;; Delete (Remove a key-value pair)
(def deleted-dictionary (dissoc my-dictionary :city))

;; Explanation:

;; Dictionary (Map):
;;    - We create a dictionary/map `my-dictionary` with key-value pairs representing a person's name, age, and city.
;;    - The `(get my-dictionary :age)` expression retrieves the value associated with the key `:age` (30).
;;    - The `(assoc my-dictionary :age 35)` expression updates the value associated with the key `:age` to 35, creating a new updated dictionary.
;;    - The `(dissoc my-dictionary :city)` expression remove the city from existing dictionary and return the new values in deleted-dictionary.

(println "New dictionary after create operation:" new-dictionary)
(println "Updated dictionary after update operation:" updated-dictionary)
(println "Dictionary after removing city" deleted-dictionary)

;; TODO: Add dictionary methods with examaples like get, assoc, dissoc, contains? and etc..

(println "__________________________________________________________")