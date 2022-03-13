package lb3;

public class Washing extends ServicesDecorator {

    ClothesIF clothes;

    public Washing(ClothesIF clothes){
        this.clothes = clothes;
    }

    @Override
    public String getDescription() {
        return  clothes.getDescription() + " Постирано";
    }
}
