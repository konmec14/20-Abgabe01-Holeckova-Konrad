# 20-Aufgabe01-Holeckova-Konrad
This repository includes the first project to be implemented for the System Configuration Management exercise.

In this project the purpose is to get to know git, maven, javadoc and unit testing.
The existing java project called "Drinks" will be extended and implemented in java environment.

**Project Drinks already contains:**
- Drink.java
- SimpleDrink.java (extends Class Drink)
- Liquid.java
- LiquidTest.java (unit tests) <br />
All classes contain getters and setters as well constructors and javadoc.
Preexisting tests using junit5 are also implemented in LiquidTest.java.

**Planned extensions:** <br />
1. *Longdrink class*  <br />
This is a subclass from Drink.java which includes <br />
    - Collection for ingredients: ArrayList
    - Double for alcohol procentage: Double
    - Fruit topping: String
    - Is creamy: Boolean
2. *ZeroPercentAlcoholException* <br />
This exception will be thrown when the alcohol percent of all liquids put together<br />
divided by the number of liquids (ingredients) matches the value 0. It will be thrown in the constructor from Longdrink.java <br/>
3. *Collections* <br />
ArrayList contains Objects of the Class Liquid (one ingredient is one liquid) <br />

