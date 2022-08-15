package Patterns.Builder.Builders;

import Patterns.Builder.Components.Dough;
import Patterns.Builder.Components.Filling;
import Patterns.Builder.Components.Sprinkle;

public interface Builder {
    public void addDough(Dough dough);
    public void addFilling(Filling filling);
    public void addSprinkle (Sprinkle sprinkle);
}
