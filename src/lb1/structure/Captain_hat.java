package lb1.structure;

import java.util.ArrayList;

public class Captain_hat extends Cap{

    private final String doc = "Класс Captain_hat";

    public Captain_hat(ArrayList<String> newVar1, float newVar2, float newVar3) {
        super(newVar1, newVar2, newVar3);
    }

    public String getDescription(){
        return doc;
    }

}
