package com.tactfactory.dp.builder;

/** Director. */
public class Pizzaiolo {

    private PizzaBuilder builder;

    public void setBuilder(final PizzaBuilder builder) {
        this.builder = builder;
    }

    public Pizza preparer() {
        this.builder.creerPizza();
        this.builder.monterPate();
        this.builder.monterSauce();
        this.builder.monterIngredients();

        return this.builder.construit();
    }
}
