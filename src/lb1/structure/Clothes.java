package lb1.structure;

import lb3.ClothesIF;

import java.util.ArrayList;

public class Clothes implements ClothesIF {
  final private String doc =" Класс Clothers";
  private ArrayList<String> materials = new ArrayList<>();
  private float weight;
  private float size;

  public Clothes(ArrayList<String> newVar1, float newVar2, float newVar3){
    materials = newVar1;
    weight = newVar2;
    size = newVar3;
  }

  public void setMaterials (ArrayList<String> materials) {
        this.materials = materials;
  }

  public ArrayList<String> getMaterials () {
    return materials;
  }

  public void setWeight (float weight) {
    this.weight = weight;
  }

  public float getWeight () {
    return weight;
  }

  public void setSize (float size) {
    this.size = size;
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
