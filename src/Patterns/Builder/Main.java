package Patterns.Builder;

import Patterns.Builder.Builders.Builder;
import Patterns.Builder.Builders.RaisinPieBuilder;
import Patterns.Builder.Builders.RecipeBuilder;
import Patterns.Builder.Cakes.Cake;
import Patterns.Builder.Cakes.Recipe;
import Patterns.Builder.Directors.DirectorFactory;

public class Main {
    public static void main(String[] args) {

        Cake cake = new Cake();

        // Создание пирога поэтапно

        RaisinPieBuilder builder = new RaisinPieBuilder(cake);
        builder.addSprinkle();
        builder.addFilling();
        builder.addDough();
        cake = builder.getCake();

        System.out.println("Пирог испечен!!");
        System.out.println("Масса пирога ".concat(String.valueOf(cake.getDough().getMass())));

        // Создание пирога с помощью директора

        RaisinPieBuilder builder2 = new RaisinPieBuilder(cake);
        DirectorFactory directorFactory = new DirectorFactory();
        directorFactory.bakeCake(builder2);
        System.out.println("Пирог испечен c использование директора!!");
        System.out.println("Масса пирога ".concat(String.valueOf(cake.getDough().getMass())));

        // Создание рецепта пирога

        Recipe recipe = new Recipe();
        RecipeBuilder recipeBuilder = new RecipeBuilder(recipe);
        directorFactory.bakeCake(recipeBuilder);

        System.out.println("Создан рецепт");
        System.out.println("Итого масса продукта: ".concat(String.valueOf(recipe.getTotalMass())));
        System.out.println("Итого состав продукта: ".concat(String.valueOf(recipe.getTotalProducts())));
        System.out.println("Итого калории продукта: ".concat(String.valueOf(recipe.getTotalCal())));
    }
}
