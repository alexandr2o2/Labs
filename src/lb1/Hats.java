package lb1;

public class Hats extends Clothes{

  private final String doc = "Класс Hats";
  private float Visor_area;

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
