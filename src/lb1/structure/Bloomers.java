package lb1.structure;

import java.util.ArrayList;

public class Bloomers extends Trousers {
  private final String doc = "Класс Trousers";

  public Bloomers(ArrayList<String> newVar1, float newVar2, float newVar3) {
    super(newVar1, newVar2, newVar3);
  }

  public String  getDescription() {
    return doc;
  }


}
