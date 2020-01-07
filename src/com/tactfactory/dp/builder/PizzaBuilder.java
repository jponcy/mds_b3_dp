package com.tactfactory.dp.builder;

import java.util.ArrayList;
import java.util.List;

/** Builder. */
public abstract class PizzaBuilder {
//    protected Pizza pizza;

    protected String sauce;
    protected String pate;
    protected List<String> ingredients = new ArrayList<>();

    public Pizza creerPizza() {
        return new Pizza();
    }

    public abstract void monterPate();
    public abstract void monterSauce();
    public abstract void monterIngredients();

    public Pizza construit() {
        final Pizza result = new Pizza();

        result.setPate(this.pate);
        result.setSauce(this.sauce);
        result.setIngredients(this.ingredients);

        return result;
    }
}
