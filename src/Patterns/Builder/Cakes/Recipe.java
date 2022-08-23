package Patterns.Builder.Cakes;

import Patterns.Builder.Components.Dough;
import Patterns.Builder.Components.Filling;
import Patterns.Builder.Components.Sprinkle;

public class Recipe {
    private Dough dough;
    private Filling filling;
    private Sprinkle sprinkle;
    private CakeTypes cakeTypes;
    private double totalMass;
    private String totalProducts;
    private double totalCal;
    private boolean totalGlFree;

    public Recipe() {
    }

    public double getTotalMass() {
        totalMass = filling.getMass() + sprinkle.getMass() + dough.getMass();
        return totalMass;
    }

    public String getTotalProducts() {
        totalProducts = dough.getComposition().concat(sprinkle.getComposition()).concat(dough.getComposition());
        return totalProducts;
    }

    public double getTotalCal() {
        totalCal = dough.getCalories() + filling.getCalories() + sprinkle.getCalories();
        return totalCal;
    }

    public boolean isTotalGlFree() {
        return totalGlFree;
    }

    public void setCakeTypes(CakeTypes cakeTypes) {
        this.cakeTypes = cakeTypes;
    }

    public Recipe(Dough dough, Filling filling, Sprinkle sprinkle, CakeTypes cakeTypes) {
        this.dough = dough;
        this.filling = filling;
        this.sprinkle = sprinkle;
        this.cakeTypes = cakeTypes;
    }

    public CakeTypes getCakeTypes() {
        return cakeTypes;
    }

    public Dough getDough() {
        return dough;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public Filling getFilling() {
        return filling;
    }

    public void setFilling(Filling filling) {
        this.filling = filling;
    }

    public Sprinkle getSprinkle() {
        return sprinkle;
    }

    public void setSprinkle(Sprinkle sprinkle) {
        this.sprinkle = sprinkle;
    }
}
