(ns examples.basic.literals)

(println "\n#################### Literals #################### \n - https://clojure.org/guides/learn/syntax")

;; 
;; Literals (https://clojure.org/guides/learn/syntax):
;; 
;; In Clojure, literals are representations of data values that can be 
;; directly written in your code without needing to be evaluated. Clojure 
;; provides various types of literals for representing different kinds of data. 
;; 
;; Here are some common literals in Clojure along with their syntax and code examples:
;; 
;; 1. Numeric Literals:
(println "\n1. Numeric Literals: ")
;; Numeric literals in Clojure can represent integers, decimals, ratios, and more. Here are a few examples:
;; 
;; - Integer literal: An integer value without any decimal point.
;;   Syntax: 123 - <any-number>
;;   Example: 42
(println "\n i. Integer literal Examples:\n")
(println 42)
(println 10)
(println 121213)
(println "Type: " (type 42))
;; 
;; - Decimal literal: A floating-point value with a decimal point.
;;   Syntax: 123.45 - <any-floating-number>
;;   Example: 3.14
(println "\n ii. Decimal Literal Examples:\n")
(println 3.14)
(println 12.12)
(println 2.120000)
(println "Type: " (type 3.14))
;; 
;; - Ratio literal: A rational number expressed as a ratio of two integers.
;;   Syntax: 1/2 - <any-number>/<any-number>
;;   Example: 22/7
(println "\n iii. Ratio Literal Examples:\n")
(println 22/7)
(println 112/12)
(println 12131/1233)
(println "Type: " (type 22/7))
(println "\n--------------------------------------------\n")
;; 2. String Literals:
;; String literals represent sequences of characters enclosed in double quotes. They can include any valid Unicode characters.
;; Syntax: "Hello, World!" - <any-string> or <any-group-of-valid-characters>
;; Example: "Clojure is awesome!"
(println "\n2. String Literals:\n")
(println "Clojure is awesome!")
(println "Test ABC 123")
(println "12") ;; This is also string,
(println "Type: " (type "Clojure is awesome!"))
(println "\n--------------------------------------------\n")

;; 3. Character Literals:
;; Character literals represent single characters enclosed in single quotes.
;; Syntax: \c - <backward slash><any-character>
;; Example: \a
(println "\n3. Character Literals:\n")
(println \a)
(println \b)
(println \c)
(println "Type: " (type \a))
(println "\n--------------------------------------------\n")

;; 4. Boolean Literals:
;; Boolean literals represent logical values, either `true` or `false`.
;; Syntax: true or false - <true|false>
;; Example: true
(println "\n4. Boolean Literals:\n")
(println true)
(println false)
(println "Type: " (type true))
(println "\n--------------------------------------------\n")

;; 5. Nil Literal:
;; The nil literal represents the absence of a value or the null value.
;; Syntax: nil
;; Example: nil
(println "\n5.  Nil Literal:\n")
(println nil)
(println "Type: " (type nil))
(println "\n--------------------------------------------\n")

;; 6. Collection Literals:
;; Clojure provides literal notations for common collections like lists, vectors, sets, and maps.
(println "\n6. Collection Literals:")
;; - List Literal:
;;   Syntax: (1 2 3) - 
;;   Example: (4 5 6)
(println "\n i. List Literal:\n")
(println `(1 2 3)) ;; Literal List (creation of a literal list without evaluating its contents)
(println (list 4 5 6)) ;; list function is being used to create a list
(def my-list (list 7 8 9)) ;; list function is being used to create a list and assing a value to my-list
(println my-list) ;; print my-list on output
(println "Type: " (type my-list))
;; - Vector Literal:
;;   Syntax: [1 2 3]
;;   Example: [4 5 6]
(println "\n ii. Vector Literal:\n")
(println [1 2 3])
(println (vector 4 5 6)) ;; vector function is being used to create a vector
(println "Type: " (type [1 2 3]))
;; - Set Literal:
;;   Syntax: #{1 2 3} - #{ element1 element2 element3 elementN....}
;;   Example: #{4 5 6}
(println "\n iii. Set Literal:\n")
(println #{1 2 3})
(println (hash-set 4 5 6))
(println "Type: " (type #{1 2 3}) (type (hash-set 4 5 6)))
;; - Map Literal:
;;   Syntax: {:key1 val1 :key2 val2}
;;   Example: {:name "Alice" :age 30}
(println "\n iv: Map Literal:\n")
(println {:name "Alice" :age 30})
(println (hash-map :name "Bob" :age 40))
(println "Types: " (type {:name "Alice" :age 30})  (type (hash-map :name "Bob" :age 40)))
(println "\n--------------------------------------------\n")

;; Here's an example that demonstrates the use of literals in Clojure code:
(println "Some Examples:")
(def my-test-map {:name "Alice" :age 30})
(def my-test-list [1 2 3])
(def my-test-string "Hello, World!")
(def my-test-boolean true)

(println "Map: " my-test-map)     ; Output: {:name "Alice", :age 30}
(println "List: " my-test-list)    ; Output: [1 2 3]
(println "String: " my-test-string)  ; Output: Hello, World!
(println "Boolean: " my-test-boolean) ; Output: true

;; In this example, we define variables using various literal types: a map, a vector, a string, and a boolean.
;; We then print the values of these variables to demonstrate the usage of literals.
;; Literals are an essential aspect of Clojure, allowing for concise and expressive representation of data values in code.
;; Note: You will see more examples in the code.

;; TODO: Add more examples of different kinds

(println "\n__________________________________________________________\n")