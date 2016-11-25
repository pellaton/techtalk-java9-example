# techtalk-java9-example
Examples of my TechTalk on Java 9 Modules

##Prerequsistes
* [JDK 9 Early Access with Project Jigsaw](https://jdk9.java.net/jigsaw/) (build 145 is used for the examples)
* Optionally a bash shell to run the build commands

##Example 1: two simple modules
This example consist of a java package containing a PadLeft (leftpad) and another package containing a simple application using the util (application).

*1. Compile without modules and run with classc classpath*
```
$ javac -d target $(find ./src -name '[A-Z]*.java')
$ java -cp target  com.github.pellaton.java9.application.Main
```
  
*2. Compile as Java 9 modules and run with module path*
```
$ javac --module-source-path src -d target $(find . -name '*.java')
$ java --module-path target -m application/com.github.pellaton.java9.application.Main
```

