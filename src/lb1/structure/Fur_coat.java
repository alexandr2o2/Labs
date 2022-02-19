package lb1.structure;

import java.util.ArrayList;

public class Fur_coat extends Jackets{
  private final String doc = "Класс Fur_coat";

  public Fur_coat(ArrayList<String> newVar1, float newVar2, float newVar3, int newVar4, boolean newVar5) {
    super(newVar1, newVar2, newVar3, newVar4, newVar5);
  }

  public String  getDescription() {
    return doc;
  }


}
