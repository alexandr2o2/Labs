package lb1;

public class Jackets extends Clothes{

  private final String doc = "Класс Jackets";
  private int Number_of_pockets;
  private boolean Watch_pocket;  public Jackets () { };

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
