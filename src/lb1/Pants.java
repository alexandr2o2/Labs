package lb1;

public class Pants extends Clothes {

  private final String doc = "Класс Pants";
  private float length;
  private boolean belt_loops;

  public void setLength (float newVar) {
    length = newVar;
  }

  public float getLength () {
    return length;
  }

  public void setBelt_loops (boolean newVar) {
    belt_loops = newVar;
  }

  public boolean getBelt_loops () {
    return belt_loops;
  }

  public String getDescription() {
    return doc;
  }


}
