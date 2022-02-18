package lb1;

import java.util.ArrayList;

public class Clothes {
  final private String doc =" Класс Clothers";
  private ArrayList<String> materials = new ArrayList<>();
  private float weight;
  private float size;

  public void setMaterials (ArrayList<String> newVar) {
        materials = newVar;
  }

  public ArrayList<String> getMaterials () {
    return materials;
  }

  public void setWeight (float newVar) {
    weight = newVar;
  }

  public float getWeight () {
    return weight;
  }

  public void setSize (float newVar) {
    size = newVar;
  }

  public float getSize () {
    return size;
  }

  public String getDescription() {
    return doc;
  }

  public void addMaterials(String newVar) {
    materials.add(newVar);
  }


}
