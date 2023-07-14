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

;; 
;; We know Clojure is a dynamically-typed, functional programming language that runs on the JVM 
;; and provides interoperability with Java run's on JVM.
;; 
;; Generally in Java, expressions return values, whereas statements do not.
;; However, In Clojure, everything is an expression!
;; Everything returns a value, and a block of multiple expressions returns the last value. 
;; Expressions that exclusively perform side-effects return nil.

;; Statements
(let [x 10]
  (println "The value of x is" x)) ;; print the output and return nil

;; Expressions
(let [x 10]
  (* x 2)) ;;perform the operation and return the evaluated value.

;; Flow Control Expressions
;; Flow control expressions in Clojure are used to control the execution 
;; flow of code based on specific conditions. Here's a short explanation 
;; of each flow control expression:
;; 
;; 1. `if`: Evaluates a condition and executes one of two branches based on the result.
;; 2. `Truth`: Checks if a value is truthy or falsy.
;; 3. `if` and `do`: Allows executing multiple expressions in the `true` branch of an `if` expression.
;; 4. `when`: Executes a block of code if a condition is truthy.
;; 5. `cond`: Evaluates multiple conditions and executes the body of the first true condition.
;; 6. `cond` and `else`: Similar to `cond`, but includes an `else` condition for when no other conditions match.
;; 7. `case`: Matches a value against multiple cases and executes the corresponding expression.
;; 8. `case` with `else-expression`: Similar to `case`, but provides a default value when no cases match.

;; These flow control expressions provide flexibility to handle different conditions and control the program flow accordingly.

;; Let's see the few examples for every floe control expressions

(println "\nFlow Control Expressions:\n")

;; 1. if
(if (> x 10)
  (println "x is greater than 10")
  (println "x is less than or equal to 10"))
;; Let's break it down to understand:
;; The `if` expression evaluates a condition specified within the parentheses > x 10. 
;; If the condition is true (i.e., if x is greater than 10), 
;; it executes the expression (println "x is greater than 10") . 
;; If the condition is false (i.e., if x is less than or equal to 10), 
;; it executes the expression (println "x is less than or equal to 10").
;; 
;; In summary, this code checks the value of x and prints a corresponding message based on whether it is greater than 10 or not.

;; 2. Truth
(if (not (nil? my-collection))
  (println "my-collection is truthy")
  (println "my-collection is nil or false"))
;; Let's break it down to understand:
;; The `Truth` expression checks whether a value is truthy or falsy. 
;; In this code, it evaluates the condition (not (nil? my-collection)). 
;; If the my-collection variable is not nil (i.e., it has a value), 
;; it is considered truthy, and the expression (println "my-collection is truthy") is executed.
;; Otherwise, if my-collection is nil or evaluates to false, 
;; the expression (println "my-collection is nil or false") is executed.
;; 
;; In summary, this code checks the truthiness of the my-collection variable and prints a corresponding message based on whether it has a value or not.

;; 3. if and do
(if (> x 10)
  (do
    (println "x is greater than 10")
    (println "Perform additional actions here")))
;; Let's break it down to understand:
;; The `if` expression evaluates a condition specified within the parentheses (> x 10). 
;; If the condition is true (i.e., if x is greater than 10), 
;; it executes the expressions enclosed within the do block. In this case, 
;; the do block contains two expressions: (println "x is greater than 10") and (println "Perform additional actions here").
;; 
;; The purpose of the do expression is to group multiple expressions together and 
;; treat them as a single expression. It allows executing multiple actions within the 
;; if branch without the need for an explicit function or form.
;; 
;; In summary, this code checks if x is greater than 10. If it is, 
;; it executes multiple actions specified within the do block, which in this case involve printing two separate messages.

;; 4. when
(when (not-empty my-collection)
  (println "Collection is not empty"))
;; 
;; The `when` expression checks whether a condition is truthy. In this code, 
;; it evaluates the condition (not-empty my-collection) . If my-collection 
;; is not empty (i.e., it contains elements), the subsequent expression (println "Collection is not empty") is executed.
;; 
;; The purpose of the when expression is to perform an action or execute code only when a 
;; specific condition is met. It allows you to avoid nested if expressions when you only need to execute code in the true branch.
;; 
;; In summary, this code checks if my-collection is not empty and prints a message 
;; indicating that the collection is not empty if the condition is met. 

;; 5. cond
;; The `cond` expression evaluates multiple conditions and their corresponding 
;; expressions until it finds a condition that evaluates to true. In this code, 
;; the conditions are specified inside the parentheses, and each condition is followed by its corresponding expression.
(cond
  (< x 10) (println "x is less than 10")
  (> x 10) (println "x is greater than 10")
  :else (println "x is equal to 10"))
;; Let's break it down to understand:
;; If x is less than 10, the expression (println "x is less than 10") is executed.
;; If x is greater than 10, the expression (println "x is greater than 10") is executed.
;; If none of the conditions above are met, the :else keyword is used as the default condition, and the expression (println "x is equal to 10") is executed.
;; The :else keyword acts as a catch-all condition when none of the preceding conditions evaluate to true.
;; 
;; In summary, this code checks the value of x and prints a message based on whether it is less than 10, greater than 10, or equal to 10.


;; 6. cond and else
;; The cond expression evaluates multiple conditions and their corresponding 
;; expressions until it finds a condition that evaluates to true. In this code, 
;; the conditions are specified inside the parentheses, and each condition is followed by its corresponding expression.
(cond
  (< x 10) (println "x is less than 10")
  (> x 10) (println "x is greater than 10")
  (>= x 10) (println "x is greater than or equal to 10")
  :else (println "x is not a number"))
;; Let's break it down to understand:
;; If x is less than 10, the expression (println "x is less than 10") is executed.
;; If x is greater than 10, the expression (println "x is greater than 10") is executed.
;; If x is greater than or equal to 10, the expression (println "x is greater than or equal to 10") is executed.
;; If none of the conditions above are met, the :else keyword is used as the default condition, and the expression (println "x is not a number") is executed.
;; The :else keyword acts as a catch-all condition when none of the preceding conditions evaluate to true.
;; 
;; In summary, this code checks the value of x and prints a corresponding message based on
;; whether it is less than 10, greater than 10, greater than or equal to 10, or none of these conditions (i.e., not a number).

;; 7. case
;; The case expression allows you to match a value against multiple cases and execute 
;; the corresponding expression of the matching case. In this code, 
;; the value being matched is `day-of-week`, and each case is specified with a value followed by its corresponding expression.
(case day-of-week
  1 "Monday"
  2 "Tuesday"
  3 "Wednesday"
  "Unknown")
;; Let's break it down to understand:
;; If `day-of-week` is 1, the expression "Monday" is returned.
;; If `day-of-week` is 2, the expression "Tuesday" is returned.
;; If `day-of-week` is 3, the expression "Wednesday" is returned.
;; If `day-of-week` does not match any of the specified cases, the default expression "Unknown" is returned.
;; The case expression evaluates the matching case from top to bottom and returns the expression associated with the first matching case.
;; 
;; In summary, this code checks the value of `day-of-week` and returns a corresponding 
;; day name based on the matched case. If no match is found, it returns the default value "Unknown".

;; 8. case with else-expression
;; The case expression allows you to match a value against multiple cases and 
;; execute the corresponding expression of the matching case. 
;; In this code, the value being matched is `day-of-week`, and each case is 
;; specified with a value followed by its corresponding expression.
(case day-of-week
  1 "Monday"
  2 "Tuesday"
  3 "Wednesday"
  :else "Unknown")
;; Let's break it down to understand:
;; If `day-of-week` is 1, the expression "Monday" is returned.
;; If `day-of-week` is 2, the expression "Tuesday" is returned.
;; If `day-of-week` is 3, the expression "Wednesday" is returned.
;; If `day-of-week` does not match any of the specified cases, the :else keyword is used as the default case, and the expression "Unknown" is returned.
;; The :else keyword acts as a catch-all case when none of the preceding cases match.
;; 
;; In summary, this code checks the value of `day-of-week` and returns a corresponding day name based on the matched case. 
;; If no match is found, it returns the default value "Unknown".

(println "__________________________________________________________")

;; Iteration for Side Effects
;; Iteration for side effects in Clojure involves performing actions or executing code repeatedly 
;; for each element of a collection. The primary focus is on the side effects produced by the code, 
;; rather than returning a new collection or values. Here's a short explanation of the different 
;; 
;; iteration constructs for side effects in Clojure:
;; 1. `dotimes`: Iterates a specified number of times, executing code within the loop for each iteration.
;; 2. `doseq`: Iterates over elements in a collection, executing code for each element.
;; 3. `doseq` with multiple bindings: Similar to `doseq`, but allows iterating over multiple collections simultaneously, 
;; binding corresponding elements for each iteration.
;; 
;; These iteration constructs are useful when you want to perform actions such as printing, updating mutable state, 
;; or interacting with external systems for each element or iteration.
(println "\nIteration for Side Effects:\n")

;; 1. dotimes
;; The `dotimes` construct allows you to perform a block of code a specified number of times. 
(dotimes [i 5]
  (println "Current iteration:" i))
;; In this code, the block of code is executed five times, as indicated by the parameter `[i 5]`. During each iteration, the value of `i` is incremented from 0 to 4.
;; The block of code inside the `dotimes` construct prints the current iteration value using `(println "Current iteration:" i)`.
;; 
;; In summary, the `dotimes` construct is used to iterate a specific number of times, executing the specified code block for each iteration.

;; 2. doseq
;; The `doseq` construct is used to iterate over elements in a collection and perform a block of code for each element. 
(doseq [item my-list]
  (println "Current item:" item))
;; In this code, the collection being iterated is `my-list`.
;; For each iteration, the block of code `(println "Current item:" item)` is executed. It prints the current item from the `my-list` collection.
;; 
;; In summary, the `doseq` construct allows you to iterate over a collection and execute code for each element, 
;; which is useful for performing actions or operations on each item in the collection.

;; 3. doseq with multiple bindings
;; The `doseq` construct with multiple bindings allows you to iterate over multiple collections simultaneously.
(doseq [item1 my-list1
        item2 my-list2]
  (println "Item1:" item1 "Item2:" item2))
;; In this code, there are two collections: `my-list1` and `my-list2`.
;; For each iteration, the values from `my-list1` and `my-list2` are sequentially bound to the variables `item1` and `item2`, 
;; respectively. The block of code `(println "Item1:" item1 "Item2:" item2)` is then executed, which prints the values of `item1` and `item2` together.
;; 
;; In summary, the `doseq` construct with multiple bindings enables you to iterate over multiple collections in parallel, 
;; processing corresponding elements from each collection.

(println "__________________________________________________________")

;; Clojure's `for`
;; Clojure's `for` is a powerful construct used for generating sequences by iterating over one or more collections. 
;; It allows you to express data transformations and filtering operations in a concise and declarative manner. 
;; 
;; Here's a short explanation of Clojure's `for`:
;; The general syntax of `for` is `(for [binding-seq filter-seq] expr)`, where:
;; - `binding-seq` defines one or more bindings that iterate over collections.
;; - `filter-seq` provides optional filtering conditions to select specific elements.
;; - `expr` represents the expression or expressions that generate the result sequence.
;; 
;; When executed, `for` generates a sequence by iterating over the collections specified in the binding sequence. 
;; For each combination of values from the bound collections, the expression `expr` is evaluated. The generated values are then combined into a sequence.
;; 
;; The `for` construct is commonly used for data transformations, filtering, and generating new sequences based on existing collections. 
;; It provides a concise and expressive way to work with data.
(println "\nClojure's for:\n")
;; Clojure's `for` Example:
(for [x my-sequence]
  (println "Current value:" x))
;; In above code, `for` construct is used to iterate over the elements of the `my-sequence` collection. 
;; For each iteration, the value of the current element is bound to the variable `x`. 
;; The expression `(println "Current value:" x)` is then executed, which prints the current value of `x`.
;; 
;; In summary, this code iterates over each element in `my-sequence` and prints the current value for each iteration.

;; Recursion
;; Recursion in Clojure refers to the technique of a function calling itself as a means of solving a problem or performing a repetitive task. 
;; It is a fundamental concept in functional programming and allows for elegant and concise solutions to various problems. 
;; Here's a short explanation of Clojure's recursion:
;; 
;; 1. Loop and Recur:
;;    - The `loop` construct defines a recursive loop that repeatedly executes a block of code.
;;    - The `recur` form is used within the loop to make a recursive call, allowing the loop to iterate with updated arguments.
;;    - This combination of `loop` and `recur` enables iterative recursion in Clojure, where the loop reevaluates itself with updated 
;;      values until a termination condition is met.
;; 
;; 2. Defn and Recur:
;;    - The `defn` form is used to define named functions in Clojure.
;;    - Recursive functions can be defined using `defn` along with the `recur` form to call the function recursively.
;;    - The `recur` form is used within the function body to make a tail-recursive call, ensuring efficient execution and preventing stack overflow.
;; 
;; 3. Recur for Recursion:
;;    - The `recur` form is used to create tail-recursive calls within a function.
;;    - Tail recursion eliminates the need for additional stack frames, making the recursion more memory-efficient.
;;    - The `recur` form allows for direct self-referencing within a function, allowing it to repeat with updated arguments.
;; 
;; Recursion is often used to solve problems that can be naturally divided into smaller sub-problems. 
;; By breaking down a complex problem into simpler versions of itself, recursive functions can produce elegant and concise solutions.
;; It's worth noting that Clojure also provides other higher-level constructs like `map`, `reduce`, and `filter`, which allow functional programming 
;; patterns to be applied without explicit recursion.
(println "\nRecursion:\n")

;; 1. loop and recur
;; The `loop` construct is used to define a recursive loop that repeatedly executes a block of code. 
(loop [x 0]
  (when (< x 10)
    (println "Current value of x:" x)
    (recur (inc x))))
;; In this code, the loop is defined with the initial value of `x` set to 0.
;; Within the loop, the condition `(when (< x 10)` is evaluated. If `x` is less than 10, the block of code inside the `when` is executed. 
;; In this case, it prints the current value of `x` using `(println "Current value of x:" x)`.
;; After executing the code block, the `recur` form is used to make a recursive call to the loop, incrementing the value of `x` by one with `(inc x)`. 
;; This allows the loop to iterate again with an updated value of `x`.
;; The loop continues to iterate as long as the condition `(when (< x 10)` is true, printing the current value of `x` and incrementing it until `x` reaches 10.
;; 
;; In summary, this code creates a loop using `loop` and `recur`, printing the current value of `x` for each iteration until it reaches 10.

;; 2. defn and recur
(defn countdown [n]
  (when (pos? n)
    (println n)
    (recur (dec n))))

(countdown 5)
;; The `defn` form is used to define a named function called `countdown` that takes a single argument `n`.
;; Within the function body, the condition `(when (pos? n)` is evaluated. If `n` is a positive number, 
;; the block of code inside the `when` is executed. In this case, it prints the current value of `n` using `(println n)`.
;; After executing the code block, the `recur` form is used to make a tail-recursive call to the `countdown` 
;; function with the decremented value of `n` using `(dec n)`. This allows the function to call itself with an updated value of `n`, 
;; eliminating the need for additional stack frames.
;; The function `countdown` is then called with an initial value of `5` using `(countdown 5)`. 
;; This initiates the recursive process, printing the values of `n` from `5` to `1`.
;; 
;; In summary, this code defines a recursive function called `countdown` using `defn` and uses `recur` to 
;; make tail-recursive calls, resulting in a countdown of numbers from a given starting value.

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
;; The code defines a recursive function called `fibonacci` using `defn`. The function takes a single argument `n`, 
;; which represents the length of the Fibonacci sequence to generate.
;; Within the function, a helper function called `fib` is defined using `letfn`. This function takes three arguments `a`, `b`, and `i`. 
;; It calculates the next Fibonacci number by adding `a` and `b` and increments `i`.
;; In the recursive part of the `fib` function, it checks if `i` is greater than or equal to `n`. 
;; If it is, it returns the current Fibonacci number `b` as the base case. Otherwise, 
;; it makes a recursive call to `fib` with updated values of `a`, `b`, and `i` using `(fib b (+ a b) (inc i))`.
;; Back in the `fibonacci` function, the initial call to `fib` is made with `a` as 0, `b` as 1, and `i` as 2. 
;; This initiates the recursive process to calculate the Fibonacci sequence.
;; After defining the `fibonacci` function, the code prints the Fibonacci sequence by iterating over a range of numbers using `for`. 
;; For each number `i` in the range, it calls `fibonacci` and prints the resulting Fibonacci number.
;; 
;; In summary, this code uses `recur` for recursion to calculate and print the Fibonacci sequence up to a specified length.

;; Exceptions
;; Exceptions in Clojure provide a mechanism for handling and signaling exceptional conditions during program execution.
;; 
;; 1. Exception Handling:
;;    - Clojure provides a `try` form to handle exceptions. It allows you to wrap a block of code that
;;      might throw an exception and specify how to handle different types of exceptions.
;;    - The `try` form consists of a series of `catch` clauses that specify the exception type to catch and the code to execute when the exception is caught.
;; 
;; 2. Throwing Exceptions:
;;    - To signal exceptional conditions, you can use the `throw` special form. It allows you to throw a specific exception with an associated value.
;;    - Exceptions can be instances of any type, but it's common to use built-in exception types like `Exception` or custom exceptions.
;; 
;; 3. Exceptions with Clojure Data:
;;    - In Clojure, exceptions are typically represented using data structures. The built-in `ex-info` and `ex-data` functions can 
;;      be used to create and attach additional information to exceptions.
;; 
;; 4. `with-open`:
;;    - Clojure provides the `with-open` macro to handle resource management with automatic cleanup.
;;    - It ensures that a resource is properly closed, even if an exception is thrown during its usage. 
;;      It guarantees the cleanup of resources like files, database connections, etc.
;; 
;; Exceptions in Clojure follow the philosophy of avoiding exceptional control flow and favoring pure functional programming. 
;; Exception handling is used for exceptional conditions, such as I/O errors, network failures, or unexpected input, rather than as a general control flow mechanism.
;; 
;; It's important to note that while exceptions exist in Clojure, idiomatic Clojure code tends to favor explicit error handling and using functional 
;; constructs like `nil` or `:failure` values to represent error conditions.
(println "\nExceptions:\n")

;; 1. Exception handling
;; The `try` form allows you to wrap a block of code that might throw an exception and specify how to handle it. 
(try
  (/ 10 0)
  (catch ArithmeticException e
    (println "Error:", (.getMessage e))))
;; In this code, the division operation `(/ 10 0)` is attempted, which would result in an `ArithmeticException` because dividing by zero is undefined.
;; Within the `try` form, the `catch` clause is used to catch and handle the specific exception type `ArithmeticException`. 
;; It takes two arguments: the exception type to catch (`ArithmeticException`) and the symbol `e` to represent the caught exception.
;; In the `catch` block, `(println "Error:" (.getMessage e))` is executed. 
;; It retrieves the error message of the caught exception using `(.getMessage e)` and prints it as an error message.
;; 
;; In summary, this code attempts a division operation that throws an `ArithmeticException`, 
;; and the `catch` block handles the exception by printing the error message associated with it.

;; 2. Throwing exceptions
(if (neg? x)
  (throw (IllegalArgumentException. "x must be positive")))
;; In this code, an `if` expression is used to check if the value of `x` is negative using the predicate `(neg? x)`. 
;; If the condition evaluates to true, indicating that `x` is negative, an `IllegalArgumentException` is thrown.
;; The `throw` special form is used to signal the exceptional condition by creating an instance of `IllegalArgumentException` with the message "x must be positive". 
;; The exception is then thrown, which interrupts the normal flow of execution.
;; 
;; In summary, this code checks if `x` is negative and throws an `IllegalArgumentException` if it is, 
;; providing a custom error message. It's a way to indicate that an invalid argument value was encountered.

;; 3. Exceptions with Clojure data
(try
  (/ 10 0)
  (catch Exception e
    (println "Error:", (ex-data e))))
;; In this code, within the `try` form, the code attempts to perform a division operation `(/ 10 0)` that would result in an exception due to dividing by zero.
;; The `catch` clause is used to catch any type of exception (`Exception` is a general exception type) and handle it. The caught exception is represented by the symbol `e`.
;; In the `catch` block, `(println "Error:", (ex-data e))` is executed. 
;; The `(ex-data e)` expression retrieves the additional data attached to the exception using the `ex-data` function. 
;; It allows you to attach custom data to an exception, providing more information about the exception.
;; The custom error message, along with the additional data attached to the exception, is then printed as an error message.
;; 
;; In summary, this code attempts a division operation that would result in an exception. 
;; The `catch` block catches the exception, and the `ex-data` function retrieves and prints any additional data attached to the exception, 
;; providing more context about the error.

;; 4. with-open
;;
;; Example Code:
;;
;; ```clojure
;; (with-open [reader (clojure.java.io/reader "myfile.txt")]
;;     (println (slurp reader)))
;; ```
;; Note: Wrapping the above code in a try-catch block so that the program should not terminate as we need to run more different examples.
(try
  (with-open [reader (clojure.java.io/reader "myfile.txt")]
    (println (slurp reader)))
  (catch Exception e
    (println "An error occurred:", (.getMessage e))))
;; The code demonstrates the usage of `with-open` in Clojure for resource management, specifically for reading from a file.
;; The `with-open` macro ensures that a resource, in this case, a file reader, is properly opened and closed,
;; even if an exception occurs during its usage. It guarantees the cleanup of the resource.
;; Within the `with-open` block, a file reader is created using `(clojure.java.io/reader "myfile.txt")`.
;; The file "myfile.txt" is opened for reading, and the resulting reader is bound to the symbol `reader`.
;; The code `(println (slurp reader))` reads the content of the file using the `slurp` function and prints it.
;; Once the block of code inside `with-open` completes, regardless of whether an exception occurred or not,
;; the file reader is automatically closed, releasing any associated system resources.
;;
;; In summary, `with-open` ensures proper resource management for reading from a file.
;; It automatically opens and closes the file reader, allowing you to safely read from the file and ensure cleanup after the operation.

(println "__________________________________________________________")
