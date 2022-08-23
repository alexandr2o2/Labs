package Patterns.Builder.Builders;

import Patterns.Builder.Cakes.Cake;
import Patterns.Builder.Cakes.CakeTypes;
import Patterns.Builder.Components.Dough;
import Patterns.Builder.Components.Filling;
import Patterns.Builder.Components.Sprinkle;

public class RaisinPieBuilder implements Builder {

    Cake cake;

    public RaisinPieBuilder(Cake cake){
        this.cake = cake;
        this.cake.setCakeTypes(CakeTypes.RAISIN_CAKE);
    }

    @Override
    public void addDough() {
        Dough dough = new Dough(10,"Мука, масло, сахар", false, 150);
        cake.setDough(dough);
    }

    @Override
    public void addFilling() {
        Filling filling = new Filling(10,"Изюм", true, 100);
        cake.setFilling(filling);
    }

    @Override
    public void addSprinkle() {
        Sprinkle sprinkle = new Sprinkle(1, "Сахарная пудра", true, 200);
        cake.setSprinkle(sprinkle);
    }

    @Override
    public void reset() {
        this.cake = new Cake();
    }

    public Cake getCake(){
        return this.cake;
    }
}
