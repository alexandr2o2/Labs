package Patterns.Builder.Builders;


import Patterns.Builder.Cakes.Recipe;
import Patterns.Builder.Components.Dough;
import Patterns.Builder.Components.Filling;
import Patterns.Builder.Components.Sprinkle;

public class RecipeBuilder implements Builder {

    Recipe recipe = new Recipe();

    public RecipeBuilder(Recipe recipe) {
        this.recipe = recipe;
    }

    @Override
    public void addDough() {
        Dough dough = new Dough(10,"Мука, масло, сахар", false, 150);
        recipe.setDough(dough);
    }

    @Override
    public void addFilling() {
        Filling filling = new Filling(10,"Изюм", true, 100);
        recipe.setFilling(filling);
    }

    @Override
    public void addSprinkle() {
        Sprinkle sprinkle = new Sprinkle(1, "Сахарная пудра", true, 200);
        recipe.setSprinkle(sprinkle);
    }

    @Override
    public void reset() {
        this.recipe = new Recipe();
    }

    public Recipe getRecipe() {
        return recipe;
    }
}
