package com.tactfactory.dp.builder;

public class BuilderApp {
    public static void main(String[] args) {
        final Pizzaiolo pizzaiolo = new Pizzaiolo();
        Pizza pizza;

        pizzaiolo.setBuilder(new PizzaReine());
        pizza = pizzaiolo.preparer();

        System.out.println(pizza);

        pizzaiolo.setBuilder(new PizzaRaclette());

        for (int i = 0; i < 5; i ++) {
            pizza = pizzaiolo.preparer();
            System.out.println(pizza);
        }
    }
}
