package Patterns.Builder.Cakes;

import Patterns.Builder.Components.Dough;
import Patterns.Builder.Components.Filling;
import Patterns.Builder.Components.Sprinkle;

public class Cake {
    private Dough dough;
    private Filling filling;
    private Sprinkle sprinkle;
    private CakeTypes cakeTypes;
    private double temperature;

    public Cake(){
    }

    public Cake(Dough dough, Filling filling, Sprinkle sprinkle, CakeTypes cakeTypes, double temperature) {
        this.dough = dough;
        this.filling = filling;
        this.sprinkle = sprinkle;
        this.cakeTypes = cakeTypes;
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public CakeTypes getCakeTypes() {
        return cakeTypes;
    }

    public void setCakeTypes(CakeTypes cakeTypes) {
        this.cakeTypes = cakeTypes;
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
