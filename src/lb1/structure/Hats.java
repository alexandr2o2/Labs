package lb1.structure;

import java.util.ArrayList;

public class Hats extends Clothes{

  private final String doc = "Класс Hats";
  private float Visor_area;

  public Hats(ArrayList<String> newVar1, float newVar2, float newVar3) {
    super(newVar1, newVar2, newVar3);
  }

  public void setVisor_area (float newVar) {
    Visor_area = newVar;
  }

  public float getVisor_area () {
    return Visor_area;
  }

  public String getDescription() {
    return doc;
  }


}
