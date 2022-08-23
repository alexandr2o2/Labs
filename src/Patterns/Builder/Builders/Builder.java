package Patterns.Builder.Builders;

import Patterns.Builder.Components.Dough;
import Patterns.Builder.Components.Filling;
import Patterns.Builder.Components.Sprinkle;

public interface Builder {
    public void addDough();
    public void addFilling();
    public void addSprinkle ();
    public void reset();
}
