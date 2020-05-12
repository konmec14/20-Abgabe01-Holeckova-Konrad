# 20-Abgabe01-Holeckova-Konrad
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
    - Fruit topping: String
    - Is creamy: Boolean
2. *ZeroPercentAlcoholException* <br />
This exception will be thrown when the alcohol percent of all liquids put together<br />
divided by the number of liquids (ingredients) matches the value 0. It will be thrown in the constructor from Longdrink.java <br/>
3. *Collections* <br />
ArrayList contains Objects of the Class Liquid (one ingredient is one liquid) <br /> <a/>

**Additional extensions:**<br />
1. *Longdrink Test class*<br />
This class uses junit 5 tests to test the class Longdrink.java
2. *SimpleDrink Test class*<br />
This class uses junit 5 tests to test the class SimpleDrink.java

##### Important Code Snippet
This code is part of *Longdrink.java*. Depending on the return value of this
method the ZeroPercentAlcoholException will be thrown or not.<br />
If the returned value is 0.0 the exception will be triggered in the constructor-
because a non alcoholic drink is not a longdrink.

```java
@Override
public double getAlcoholPercent() {
    double sum=0;
    for(int i=0; i<ingredients.size(); i++) {
        sum+=ingredients.get(i).getAlcoholPercent();
    }
    return sum/ingredients.size();
}
```
