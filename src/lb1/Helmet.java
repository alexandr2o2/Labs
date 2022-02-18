package lb1;

public class Helmet extends Hats{

  private final String doc = "Класс Helmet";
  private int Degree_strength;

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
