package lb1.structure;

import java.util.ArrayList;

public class Helmet extends Hats{

  private final String doc = "Класс Helmet";
  private int Degree_strength;

  public Helmet(ArrayList<String> newVar1, float newVar2, float newVar3) {
    super(newVar1, newVar2, newVar3);
  }

  public void setDegree_strength (int newVar) {
    Degree_strength = newVar;
  }

  public int getDegree_strength () {
    return Degree_strength;
  }

  public String getDescription() {
    return doc;
  }


}
