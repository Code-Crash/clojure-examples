(ns examples.basic.flow-control)

(println "\nFlow Control Examples: \n")

;; Variables
(def x 15)
(def my-collection [1 2 3])
(def day-of-week 2)
(def my-list [10 20 30])
(def my-list1 [1 2 3])
(def my-list2 [:a :b :c])
(def my-sequence [1 2 3 4 5])

;; Statements vs. Expressions
(println "Statements vs. Expressions:\n")

;; Statements
(let [x 10]
  (println "The value of x is" x))

;; Expressions
(let [x 10]
  (* x 2))

;; Flow Control Expressions
(println "\nFlow Control Expressions:\n")

;; 1. if
(if (> x 10)
  (println "x is greater than 10")
  (println "x is less than or equal to 10"))

;; 2. Truth
(if (not (nil? my-collection))
  (println "my-collection is truthy")
  (println "my-collection is nil or false"))

;; 3. if and do
(if (> x 10)
  (do
    (println "x is greater than 10")
    (println "Perform additional actions here")))

;; 4. when
(when (not-empty my-collection)
  (println "Collection is not empty"))

;; 5. cond
(cond
  (< x 10) (println "x is less than 10")
  (> x 10) (println "x is greater than 10")
  :else (println "x is equal to 10"))

;; 6. cond and else
(cond
  (< x 10) (println "x is less than 10")
  (> x 10) (println "x is greater than 10")
  (>= x 10) (println "x is greater than or equal to 10")
  :else (println "x is not a number"))

;; 7. case
(case day-of-week
  1 "Monday"
  2 "Tuesday"
  3 "Wednesday"
  "Unknown")

;; 8. case with else-expression
(case day-of-week
  1 "Monday"
  2 "Tuesday"
  3 "Wednesday"
  :else "Unknown")

;; Iteration for Side Effects
(println "\nIteration for Side Effects:\n")

;; 1. dotimes
(dotimes [i 5]
  (println "Current iteration:" i))

;; 2. doseq
(doseq [item my-list]
  (println "Current item:" item))

;; 3. doseq with multiple bindings
(doseq [item1 my-list1
        item2 my-list2]
  (println "Item1:" item1 "Item2:" item2))

;; Clojure's for
(println "\nClojure's for:\n")
(for [x my-sequence]
  (println "Current value:" x))

;; Recursion
(println "\nRecursion:\n")

;; 1. loop and recur
(loop [x 0]
  (when (< x 10)
    (println "Current value of x:" x)
    (recur (inc x))))

;; 2. defn and recur
(defn countdown [n]
  (when (pos? n)
    (println n)
    (recur (dec n))))

(countdown 5)

;; 3. recur for recursion
(defn fibonacci [n]
  (letfn [(fib [a b i]
            (if (>= i n)
              b
              (fib b (+ a b) (inc i))))]
    (fib 0 1 2)))

(println "Fibonacci sequence:")
(for [i (range 10)]
  (println (fibonacci i)))

;; Exceptions
(println "\nExceptions:\n")

;; 1. Exception handling
(try
  (/ 10 0)
  (catch ArithmeticException e
    (println "Error:", (.getMessage e))))

;; 2. Throwing exceptions
(if (neg? x)
  (throw (IllegalArgumentException. "x must be positive")))

;; 3. Exceptions with Clojure data
(try
  (/ 10 0)
  (catch Exception e
    (println "Error:", (ex-data e))))

;; 4. with-open
(with-open [reader (clojure.java.io/reader "myfile.txt")]
  (println (slurp reader)))

(println "__________________________________________________________")
