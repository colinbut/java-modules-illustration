# Java Modules Illustration

This project demonstrates Java Modules introduced since Java 9. Java Modules is a result of the now widely known Jigsaw project.
Born the Java Platform Modules System.

## Listing Modules

```bash
java --list-modules
```

```bash
java --describe-module
```

### Compilation

```bash
javac -d mods/com.mycompany.java9modulesillustration src/main/java/com.mycompany.java9modulesillustration/module-info.java src/main/java/com.mycompany.java9modulesillustration/com/mycompany/java9modulesillustration/HelloModules.java
```

### Execution

```bash
java --module-path mods --module com.mycompany.java9modulesillustration/com.mycompany.java9modulesillustration.HelloModules
```

### Creating a Jar

```bash
jar --create --file target/hello-modules.jar --main-class com.mycompany.java9modulesillustration.HelloModules -C mods/com.mycompany.java9modulesillustration .
```

__Running the jar__
```bash
java --module-path target/hello-modules.jar --module com.mycompany.java9modulesillustration/com.mycompany.java9modulesillustration.HelloModules
```

```bash
java --module-path target/HelloModules.jar --describe-module com.mycompany.java9modulesillustration
```
