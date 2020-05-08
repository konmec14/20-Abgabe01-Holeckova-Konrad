package at.fhj.iit;

import java.util.ArrayList;

/**
 * Class Longdrink inherits from Drink.java
 * Class represents a longdrink which uses liquid as part of its ingredients as well as
 * cream and has toppings
 * This Class also includes a self made ZeroPercentAlcoholException
 *
 * @authors Melinda Konrad, Lydia Holeckova
 */
public class Longdrink extends Drink {

    private ArrayList<Liquid> ingredients = new ArrayList<Liquid>();
    private String fruitTopping;
    private boolean isCreamy = false;

    /**
     * Creates a Drink object with given name, fruitTopping, cream and ingredients
     * This method will throw the self made exception if there is no alcohol in the Longdrink
     *
     * @param name name of the drink
     * @param fruitTopping a fruit on top of the longdrink
     * @param ingredients liquids that the Longdrink contains
     * @param isCreamy tells, if there is cream inside the longdrink
     */
    public Longdrink(String name, String fruitTopping, boolean isCreamy, ArrayList<Liquid> ingredients)  {
        super(name);
    }

    /**
     * Method fills ingredients - list
     *
     * @param l liquid that will be added to the ingredients
     */
    public void add(Liquid l) {
    }

    /**
     * Gets the volume of the ingredients and adds them together and returns that
     *
     * @return summ of all the volumes
     */
    @Override
    public double getVolume() {
        return 0;
    }

    /**
     * Gets the mean of the alcohol percentages of the ingredients and returns that
     *
     * @return sum of alcohol percentages divided by the number of liquids
     */
    @Override
    public double getAlcoholPercent() {
        return 0;
    }

    /**
     *  checks if the longdrink is alcoholic
     *
     * @return always true
     */
    @Override
    public boolean isAlcoholic() {
        return true;
    }

    /**
     * Returns ingredients
     *
     * @return the list of liquids in the longdrink
     */
    public ArrayList<Liquid> getIngredients() {
        return ingredients;
    }

    /**
     * Uses external list of liquids to fill ingredients - list
     *
     * @param ingredients the list of liquids in the longdrink
     */
    public void setIngredients(ArrayList<Liquid> ingredients) {
        this.ingredients = ingredients;
    }

    /**
     * Returns Fruit topping
     *
     * @return fruitTopping a fruit on top of the longdrink
     */
    public String getFruitTopping() {
        return fruitTopping;
    }

    /**
     * Sets Fruit topping
     *
     * @param fruitTopping a fruit on top of the longdrink
     */
    public void setFruitTopping(String fruitTopping) {
        this.fruitTopping = fruitTopping;
    }

    /**
     * Checks if cream is part of the longdrink
     *
     * @return value of isCreamy
     */
    public boolean isCreamy() {
        return isCreamy;
    }

    /**
     * Sets isCreamy to true or false
     *
     * @return value of isCreamy
     */
    public void setCreamy(boolean creamy) {
        isCreamy = creamy;
    }

}
