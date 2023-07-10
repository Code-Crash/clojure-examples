# Clojure Examples

## Overview

This repository contains the different examples for clojure language, examples can anything like vector (array), list and dictionary manipulation or any general examples like reading/writing in file, different database connectivity, any logic and optimization tricks within code.

You can learn about clojure on official website as well, see the [link](https://clojure.org/guides/learn/clojure)

## Examples

To see the examples with syntax and code, you can read the code base in below sequence:

1. [Literals](./examples/src/examples/basic/literals.clj)
    1. [List](./examples/src//examples//basic/list.clj)
    2. [Vector (Array)](./examples/src//examples//basic/vector.clj)
    3. [Map (Dictionary)](./examples/src//examples//basic/dictionary.clj)
    4. [Set](./examples/src//examples/basic/set.clj)
2. [Functions](./examples/src/examples/basic/functions.clj)

### Run Examples

To run the examples, first step **install [clojure](https://clojure.org/guides/install_clojure)**, and then follow below steps:

1. **[STEP-1]** : *Clone this repository*
2. **[STEP-2]** : *open terminal and navigate to cloned directory using `cd` command*
3. **[STEP-3]** : *now again use `cd` command to change into [`examples`](./examples/) directory*
4. **[STEP-4]** : *run command `lein run`, on terminal you will see the output of out different examples.*
5. **[STEP-5]** : *Now, we need to start exploring code base to understand the syntax and code examples for different clojure features.*
6. **[STEP-6]** : *Start exploring [Examples](#examples) in sequence to understand the basic of Clojure.*
7. **[STEP-7]** : *Now, you can try and explore [Examples with REPL](#run-examples-with-repl)*

### Run Examples with REPL

The REPL (Read-Eval-Print Loop) is an interactive programming environment that allows you to read code, evaluate it, and see the results. The REPL provides a convenient way to experiment, test code snippets, and develop Clojure programs interactively ([more on REPL](https://clojure.org/guides/repl/introduction)).

See the steps to run our examples in REPL mode:

1. **[STEP-1]** : *open terminal and navigate to cloned directory using `cd` command*
2. **[STEP-2]** : *now again use `cd` command to change into [`examples`](./examples/) directory*
3. **[STEP-3]** : *run command `lein repl`*
4. **[STEP-4]** : *Above command will run our code once and ask for input using prompt namely `examples.core=>`*
5. **[STEP-5]** : Now, you can try and explore [Examples with REPL](#run-examples-with-repl)

Few examples for REPL to play around:

Run this statement in REPL (`examples.core=>`):

Example 1:

```sh
examples.core=> (load-file "src/examples/core.clj")
#'examples.core/-main
examples.core=> (#'examples.core/-main)
Hello, World!
nil
examples.core=>
```

Example 2:


```sh
examples.core=> (load-file "src/examples/basic/functions.clj")
# ..... output from functions ......
```

From REPL, we can load any specific file or namespace and run and debug the code base, please have a look, how we can use [REPL](https://clojure.org/guides/repl/introduction)


## Project Structure

This project is generate using below command:

`lein new app examples`

The project directory structure consists of the following components:

```
.
├── README.md
└── examples
    ├── CHANGELOG.md
    ├── LICENSE
    ├── README.md
    ├── doc
    │   └── intro.md
    ├── project.clj
    ├── resources
    ├── src
    │   └── examples
    │       ├── basic
    │       │   ├── dictionary.clj
    │       │   ├── functions.clj
    │       │   ├── index.clj
    │       │   ├── list.clj
    │       │   └── vector.clj
    │       └── core.clj
    ├── target
    │   ├── classes
    │   │   └── META-INF
    │   │       └── maven
    │   │           └── examples
    │   │               └── examples
    │   │                   └── pom.properties
    │   └── stale
    │       └── leiningen.core.classpath.extract-native-dependencies
    └── test
        └── examples
            └── core_test.clj
```

Explanation of the directory structure:

- `README.md`: A markdown file containing information and instructions about the project.
- `examples`: A directory that holds all the project code and related files.
  - `CHANGELOG.md`: A markdown file that tracks the changes and updates made to the project.
  - `LICENSE`: A file that specifies the licensing terms for the project.
  - `README.md`: A markdown file containing specific information and instructions about the examples directory.
  - `doc`: A directory containing documentation files for the project.
    - `intro.md`: A markdown file providing an introduction to the project.
  - `project.clj`: A file specifying the project configuration and dependencies for Leiningen, a Clojure build tool.
  - `resources`: A directory for storing project resources such as images, configuration files, or templates.
  - `src`: The source code directory.
    - `examples`: The main namespace or package for the project's source code.
      - `basic`: A directory containing basic examples related to the project.
        - `dictionary.clj`: A Clojure source file containing code related to dictionary operations.
        - `functions.clj`: A Clojure source file containing code related to function definitions.
        - `index.clj`: A Clojure source file serving as an entry point or index for the project.
        - `list.clj`: A Clojure source file with code related to list operations.
        - `vector.clj`: A Clojure source file with code related to vector operations.
      - `core.clj`: The main Clojure source file for the project, which contains the core logic.
  - `target`: A directory generated during the build process, typically used for compiled code and artifacts.
    - `classes`: A directory containing compiled Java class files.
    - `META-INF`: A directory containing metadata for the project.
      - `maven`: A directory containing Maven-specific metadata.
        - `examples`: The Maven group ID for the project.
          - `examples`: The Maven artifact ID for the project.
            - `pom.properties`: A properties file containing project-specific information.
    - `stale`: A directory that may contain stale or outdated files.
      - `leiningen.core.classpath.extract-native-dependencies`: A file related to the build process.
- `test`: A directory containing test code for the project.
  - `examples`: The namespace or package for the project's test code.
    - `core_test.clj`: A Clojure test file containing test cases for the core namespace.