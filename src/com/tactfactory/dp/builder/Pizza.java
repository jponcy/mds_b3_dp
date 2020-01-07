package com.tactfactory.dp.builder;

import java.util.ArrayList;
import java.util.List;

/** Represente notre Product. */
public class Pizza {
    private String sauce;
    private String pate;
    private List<String> ingredients = new ArrayList<>();

    @Override
    public String toString() {
        return "Une belle pizza avec une pâte " + pate + " et une saucue " + sauce + ". Les ingrédients sont: "
                + String.join(", ", ingredients);
    }
    /**
     * @return the sauce
     */
    public String getSauce() {
        return sauce;
    }
    /**
     * @param sauce the sauce to set
     */
    public void setSauce(String sauce) {
        this.sauce = sauce;
    }
    /**
     * @return the pate
     */
    public String getPate() {
        return pate;
    }
    /**
     * @param pate the pate to set
     */
    public void setPate(String pate) {
        this.pate = pate;
    }
    /**
     * @return the ingredients
     */
    public List<String> getIngredients() {
        return ingredients;
    }
    /**
     * @param ingredients the ingredients to set
     */
    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }
}
