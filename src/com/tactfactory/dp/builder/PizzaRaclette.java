package com.tactfactory.dp.builder;

import java.util.Arrays;

/** ConcreteBuilder. */
public class PizzaRaclette extends PizzaBuilder {

    @Override
    public void monterPate() {
        this.pate = "fine";
    }

    @Override
    public void monterSauce() {
        this.sauce = "Crème";
    }

    @Override
    public void monterIngredients() {
        this.ingredients = Arrays.asList("Fromage raclette", "Jambon", "Pdt", "Oignons");
    }
}
