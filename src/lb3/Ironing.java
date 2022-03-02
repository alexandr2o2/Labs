package lb3;

import lb1.structure.Clothes;

import java.util.ArrayList;

public class Ironing extends ServicesDecorator {
    ClothesIF clothes;

    public Ironing(ClothesIF clothes){
        this.clothes = clothes;
    }

    @Override
    public String getDescription() {
        return  clothes.getDescription() + " Отглажено";
    }
}
