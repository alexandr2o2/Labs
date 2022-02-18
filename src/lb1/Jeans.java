package lb1;

public class Jeans extends Pants {

  private final String doc = "Класс Jeans";
  private boolean scuffs;

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
