package lb1.structure;

import java.util.ArrayList;

public class Jeans extends Pants {

  private final String doc = "Класс Jeans";
  private boolean scuffs;

  public Jeans(ArrayList<String> newVar1, float newVar2, float newVar3) {
    super(newVar1, newVar2, newVar3);
  }

  public void setScuffs (boolean newVar) {
    scuffs = newVar;
  }

  public boolean getScuffs () {
    return scuffs;
  }

  public String getDescription() {
    return doc;
  }


}
