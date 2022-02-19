package lb1.structure;

import java.util.ArrayList;

public class Jackets extends Clothes{

  private final String doc = "Класс Jackets";
  private int Number_of_pockets;
  private boolean Watch_pocket;

  public Jackets (ArrayList<String> newVar1, float newVar2, float newVar3, int newVar4, boolean newVar5) {
    super(newVar1, newVar2, newVar3);
    Number_of_pockets = newVar4;
    Watch_pocket = newVar5;
  };

  public void setNumber_of_pockets (int newVar) {
    Number_of_pockets = newVar;
  }

  public int getNumber_of_pockets () {
    return Number_of_pockets;
  }

  public void setWatch_pocket (boolean newVar) {
    Watch_pocket = newVar;
  }

  public boolean getWatch_pocket () {
    return Watch_pocket;
  }

  public String getDescription() {
    return doc;
  }


}
