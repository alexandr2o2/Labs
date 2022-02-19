package lb1.structure;

import lb1.structure.Clothes;

import java.util.ArrayList;

public class Pants extends Clothes {

  private final String doc = "Класс Pants";
  private float length;
  private boolean belt_loops;

  public Pants(ArrayList<String> newVar1, float newVar2, float newVar3) {
    super(newVar1, newVar2, newVar3);
  }

  public void setLength (float newVar) {
    length = newVar;
  }

  public float getLength () {
    return length;
  }

  public void setBelt_loops (boolean newVar) {
    belt_loops = newVar;
  }

  public boolean getBelt_loops () {
    return belt_loops;
  }

  public String getDescription() {
    return doc;
  }


}
