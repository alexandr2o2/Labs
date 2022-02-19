package lb1.structure;

import lb1.structure.Jackets;

import java.util.ArrayList;

public class Windcheater extends Jackets {
  private final String doc = "Класс Windcheater";

  public Windcheater(ArrayList<String> newVar1, float newVar2, float newVar3, int newVar4, boolean newVar5) {
    super(newVar1, newVar2, newVar3, newVar4, newVar5);
  }

  public String  getDescription() {
    return doc;
  }


}
