(ns examples.basic.functions)

(println "\nFunctions: \n")


;; 
;; 
;; Function: 
;;
;; A function is a named block of code that performs a specific task or computation. 
;; It can take inputs (parameters) and produce outputs (return values). 
;; Functions in Clojure are immutable and follow functional programming principles, 
;; emphasizing pure computations without side effects. They can be assigned to variables, 
;; passed as arguments to other functions, and returned as values. 
;; Functions play a central role in Clojure programming, 
;; enabling modular and reusable code structures.
;;
;; In Clojure, you can define functions using the `defn` or `fn` form. Here's the general syntax for defining a function:
;;
;; (defn function-name [param1 param2 ...]
;;       ;; function body
;;  )

;; Let's break down the components:

;; - `defn`: This is the special form used to define functions in Clojure.
;; - `function-name`: This is the name of the function you want to define. Choose a descriptive name that reflects the purpose of the function.
;; - `[param1 param2 ...]`: This is the parameter list for the function. Each parameter represents a value that the function expects as input. Parameters are enclosed in square brackets, and multiple parameters are separated by spaces.
;; - `function body`: This is the code block that contains the logic of the function. It specifies what the function does when it is invoked with the given parameters.

;; Here's a simple example that defines a function called `greet` that takes a single parameter `name` and prints a greeting message:

(println "Simple Example:\n\nOutputs:\n")
(defn greet [name]
  (println "Hello, " name))

;; In this example, the `greet` function is defined with a single parameter `name`. When the function is invoked with an argument, it prints a greeting message using the provided name.

;; You can then invoke the function by calling its name and passing the required arguments. For example:
(greet "Alice")

;; This will call the `greet` function with the argument `"Alice"`, resulting in the output:
;; Hello, Alice

;; You can define more complex functions with multiple parameters, conditional statements, loops, and other Clojure expressions, depending on the requirements of our program.

;; Let's have a look into function types and some complex examples
;; 
;; 1. Basic Function Definition and Invocation:
;; 
;; In Clojure, you define functions using the `defn` special form. 
;; The function is named `function-name` and accepts parameters `param1`, `param2`, and so on. 
;; The function body contains the code that specifies what the function does.
;; 
;; Syntax:
;; 
;;   (defn function-name [param1 param2 ...]
;;      ;; function body
;;   )
;; 
;; 
;; Example:
;; 
(println "\n1. Basic Function Definition and Invocation:\n\nOutputs:\n")
(defn greet [name]
  (println "Hello, " name))
;; 
;; Invocation:
;; 
(greet "Bob") ; Output: Hello, Alice
;; 
;; In this example, the function `greet` takes a single parameter `name` and prints a greeting message using the given name when invoked with an argument.

;; 2. Higher-Order Functions
;; 
;; Clojure supports higher-order functions, which means functions can take other functions as arguments or return functions as results. 
;; This allows for powerful and flexible programming patterns.
;; 
;; Example:
;; 
(println "\n2. Higher-Order Functions:\n\nOutputs:\n")
(defn apply-twice [f x]
  (f (f x)))

(defn add-one [x]
  (+ x 1))

(println (apply-twice add-one 5)) ; Output: 7
;; 
;; In this example, `apply-twice` is a higher-order function that takes a function `f` and a value `x`. It applies `f` to `x` twice. We define `add-one` as a helper function that adds 1 to a given value. When we invoke `apply-twice` with `add-one` and 5 as arguments, the result is 7.

;; 3. Anonymous Functions
;; 
;; Clojure allows defining anonymous functions using the `fn `special form. 
;; Anonymous functions are useful when you need to create functions on the fly without explicitly naming them.
;; 
;; Syntax:
;;   (fn [param1 param2 ...]
;;        ;; function body
;;   )
;; 
;; Example:
;; 
(println "\n3. Anonymous Functions:\n\nOutputs:\n")
(print (map (fn [x] (* x x)) [1 2 3 4 5])) ; Output: (1 4 9 16 25)
;; 
;; In this example, the anonymous function `(fn [x] (* x x))` is used with the `map` function to square each element of the input sequence `[1 2 3 4 5]`. The resulting sequence is `(1 4 9 16 25)`.

;; 4. Partial Application
;; 
;; Clojure supports partial application, allowing you to create a new function 
;; by fixing some arguments of an existing function. This can be useful when you want to reuse a function with specific arguments pre-set.
;; 
;; Example:
;; 
(println "\n4. Partial Application:\n\nOutputs:\n")
(def add-ten (partial + 10))
;; 
(println (add-ten 5)) ; Output: 15
;; 
;; In this example, `add-ten` is a new function created by partially applying the `+` function with the argument 10. When we invoke `add-ten` with the argument 5, it adds 10 to 5, resulting in 15.
;; 
;; 5. Recursive Functions:
;; 
;; Clojure supports recursion, where a function calls itself. Recursive functions are useful when 
;; solving problems that can be naturally expressed in a recursive manner.
;; 
;; Example:
;; 
(println "\n5. Recursive Functions:\n\nOutputs:\n")
(defn factorial [n]
  (if (<= n 1)
    1
    (* n (factorial (- n 1)))))
;; 
(println (factorial 5)) ; Output: 120
;; 
;; In this example, the `factorial` function calculates the factorial of a number `n`. When `n` is less than or equal to 1, it returns 1. Otherwise, it multiplies `n` with the factorial of `n-1` until the base case is reached.

;; 6. Multi-Arity Functions:
;; 
;; Clojure allows defining multi-arity functions, which are functions that have multiple sets of 
;; parameters and corresponding bodies. The appropriate body is selected based on the number of arguments passed when the function is invoked.
;; 
;; Example:
;; 
(println "\n6. Multi-Arity Functions:\n\nOutputs:\n")
(defn greet
  ([name]
   (println "Hello, " name))
  ([name salutation]
   (println salutation ", " name)))
;; 
(greet "Alice") ; Output: Hello, Alice
(greet "Bob" "Hi") ; Output: Hi, Bob
;; 
;; In this example, the `greet` function has two arities. The first arity takes a single parameter `name` and prints a simple greeting. The second arity takes two parameters, `name` and `salutation`, and prints a customized greeting using the provided salutation.

;; 7. Variadic Functions:
;; 
;; Variadic functions in Clojure can accept a variable number of arguments. The `&` symbol followed by a parameter name is used to capture the variable arguments as a sequence.
;; 
;; Example:
;; 
(println "\n7. Variadic Functions:\n\nOutputs:\n")
(defn sum-all [& numbers]
  (apply + numbers))
;; 
;; Invocation:
;; 
(println (sum-all 1 2 3)) ; Output: 6
(println (sum-all 4 5 6 7 8)) ; Output: 30
;; 
;; In this example, `sum-all` is a variadic function that accepts any number of arguments. The `& numbers` parameter captures the arguments as a sequence, and the `apply` function is used to apply the `+` function to the sequence of numbers.
;; 
;; Clojure's rich set of function capabilities, including higher-order functions, anonymous functions, partial application, recursion, multi-arity functions, and variadic functions, provide flexibility and expressiveness when solving problems in a functional programming style.

;; TODO: Add more details about functions in clojure

(println "\n__________________________________________________________")