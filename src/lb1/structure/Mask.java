package lb1.structure;

import lb1.structure.Hats;

import java.util.ArrayList;

public class Mask extends Hats {

  private final String doc = "Класс Mask";

  public Mask(ArrayList<String> newVar1, float newVar2, float newVar3) {
    super(newVar1, newVar2, newVar3);
  }

  public String getDescription() {
    return doc;
  }


}
