package com.tactfactory.dp.builder;

import java.util.Arrays;

/** ConcreteBuilder */
public class PizzaReine extends PizzaBuilder {

    @Override
    public void monterPate() {
        this.pate = "épaisse";
    }

    @Override
    public void monterSauce() {
        this.sauce = "Base tomate";
    }

    @Override
    public void monterIngredients() {
        this.ingredients = Arrays.asList("Jambon", "Champignons", "Oeuf");
    }
}
