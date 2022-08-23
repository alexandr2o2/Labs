package Patterns.Builder.Directors;

import Patterns.Builder.Builders.Builder;

public class DirectorFactory {
    public void bakeCake(Builder builder){
        builder.addDough();
        builder.addFilling();
        builder.addSprinkle();
    }
}
