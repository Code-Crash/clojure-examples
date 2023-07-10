# Clojure Examples

## Overview

This repository contains the different examples for clojure language, examples can anything like vector (array), list and dictionary manipulation or any general examples like reading/writing in file, different database connectivity, any logic and optimization tricks within code.

## Project Structure

This project is generate using below command:

`lein new app examples`


Project directory structure as below with explanation:

```
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
    │       ├── core.clj
    │       └── data
    │           ├── dictionary.clj
    │           ├── index.clj
    │           ├── list.clj
    │           └── vector.clj
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

Note: This is initial directory structure, it might change with more examples, but core structure will be always remains the same.

```


Explanation:

The project directory structure consists of the following components:

- `README.md`: The main README file that provides information about the project.
- `examples`: The root directory for the project's examples.
  - `CHANGELOG.md`: A file that keeps track of changes and updates in the project.
  - `LICENSE`: The project's license file.
  - `README.md`: A README file specifically for the examples directory.
  - `doc`: A directory for documentation files related to the examples.
    - `intro.md`: An introductory documentation file.
  - `project.clj`: The Leiningen project file that contains project-specific configuration.
  - `resources`: A directory for project resources such as configuration files, templates, etc.
  - `src`: The source code directory for the examples.
    - `examples`: The main namespace directory for the examples.
      - `core.clj`: The core namespace file that contains the main code for the examples.
      - `data`: A directory for data-related namespaces.
        - `dictionary.clj`: A namespace file for dictionary-related operations.
        - `index.clj`: A namespace file for index-related operations.
        - `list.clj`: A namespace file for list-related operations.
        - `vector.clj`: A namespace file for vector-related operations.
  - `target`: The output directory for compiled code and other generated artifacts.
    - `classes`: The directory where compiled class files are stored.
      - `META-INF`: A directory for metadata related to the project.
        - `maven`: A directory for Maven-related metadata.
          - `examples`: The Maven groupId for the project.
            - `examples`: The Maven artifactId for the project.
              - `pom.properties`: The project's POM properties file.
    - `stale`: A directory for stale or unused files.
      - `leiningen.core.classpath.extract-native-dependencies`: A specific file related to Leiningen.
- `test`: The directory for test code related to the examples.
  - `examples`: The namespace directory for test code.
    - `core_test.clj`: A test namespace file for testing the core functionality of the examples.