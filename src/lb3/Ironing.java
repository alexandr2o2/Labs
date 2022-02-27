package lb3;

import lb1.structure.Clothes;

import java.util.ArrayList;

public class Ironing extends ServicesDecorator {
    Clothes clothes;

    public Ironing(ArrayList<String> newVar1, float newVar2, float newVar3) {
        super(newVar1, newVar2, newVar3);
    }
    public Ironing(Clothes clothes){
        this.clothes = clothes;
    }

    @Override
    public String getDescription() {
        return null;
    }
}
