
# Implementation Description

The Coffee Maker Program primarily implements robustness, flexibility and re-usability design principles.

Robustness is attained by encapsulating the base variables of the Drink.java class implementing an ability to control specified integer, string and double inputs (data) types while enforcing limits with MAX, MIN cost limit values. The application also gracefully handles erroneous inputs by preserving limit values while displaying info logs for violation attempts.

Flexibility is also handled by the individuality of the classes allowing for easy price, cost, condiments, coffee and tea flavor modifications. Two techniques employed to enhance flexibility and avoid duplication is the use of Drink.java class as a member (aggregation) of the Mixer classes. Additionally the use of public static visibility modifiers for the Condiment Enum type object allows for global visibility reducing duplication in the application.

Re-usability is also implemented by the usage of aggregation type relationships within classes. The use of the base Drink.java class allows easy code reuse for other Mixer types. By this implementation the ultimate goal of low coupling between packages and high cohesion within each package is attained.

The program implements simplicity by the directness in the package and class design, relationships and implementation. This simplicity is also evident in the use of less lines of code to attain the desired functionality. This is further evident in the simplicity and ability to efficiently unit test each single method.



# UML Class Diagram

![coffee Machine UML Diagram](coffeemachine-UML-Diagram.png)


# Project Template

This is a Java Maven Project Templates


# How to compile the project

We use Apache Maven to compile and run this project. 

Type on the command line: 

```bash
mvn clean compile
```

# How to create a binary runnable package 


```bash
mvn clean compile assembly:single
```


# How to run

```bash
mvn -q clean compile exec:java -Dexec.executable="edu.bu.met.cs665.Main" -Dlog4j.configuration="file:log4j.properties"
```

# Run all the unit test classes.


```bash
mvn clean compile test

```

# Using Findbugs 

```bash
mvn findbugs:findbugs
```


# Run Checkstyle 

CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code style. 
You can change it to other styles like sun checkstyle. 

To analyze this example using CheckStyle run 

```bash
mvn checkstyle:check
```

This will generate a report in XML format

```bash
target/checkstyle-checker.xml
target/checkstyle-result.xml
```

and the following command will generate a report in HTML format that you can open it using a Web browser. 

```bash
mvn checkstyle:checkstyle
```

# Generate  coveralls:report 


PLEASE NOT THAT REPORT GENERATION ERRORS OUT BECUASE REPO IS NOT CURRENTLLY ACCESSIBLE VIA COVERALLS.

```bash
mvn -DrepoToken=4PhP9IUo1DeJfyIte4GbNys2RnsYU8rpfQqKr  cobertura:cobertura coveralls:report
```


