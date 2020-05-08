package at.fhj.iit;
import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * Test class for Longdrink.java
 * Using Junit 5
 */
@DisplayName("Testing Longdrink implementation")
public class LongdrinkTest {

    private Liquid water, wine, aperol, orangeJuice;
    private Longdrink l1, l2, l3;
    private ArrayList<Liquid> ingredients = new ArrayList<>();

    /**
     * inits longdrinks and respective liquids for EACH test
     */
    @BeforeEach
    void setup() throws ZeroPercentAlcoholException {
        // SETUP PHASE
        water = new Liquid("Wasser", 0.3, 0);
        wine = new Liquid("Wein", 0.125, 13);
        aperol = new Liquid("Aperol", 0.2, 15);
        orangeJuice = new Liquid("Orange Juice", 0.3, 0);

        ingredients.add(water);
        ingredients.add(aperol);
        ingredients.add(wine);
        l1 = new Longdrink("Drink1", "Pineapple", false, ingredients);
        ingredients.clear();

        ingredients.add(orangeJuice);
        ingredients.add(water);
        ingredients.add(wine);
        l2 = new Longdrink("Drink2", "Orange", true, ingredients);
        ingredients.clear();
    }
}
