package lb5;

import lb1.structure.Clothes;
import lb3.OriginPlace;

public abstract class Factory {
    public Clothes actionByFactory(int Value){
        Clothes clothes = creatClothes(Value);
        // Предварительные действи над объектами класса Clothes
        System.out.println(clothes.getDescription());
        return clothes;
    }

    abstract Clothes creatClothes(int Value);

}
