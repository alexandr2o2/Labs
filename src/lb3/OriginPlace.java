package lb3;

public class OriginPlace extends ServicesDecorator {
    private ClothesIF clothes;
    public OriginPlace(ClothesIF clothes) {
        this.clothes = clothes;
    }

    @Override
    public String getDescription() {
        return clothes.getDescription() + " Собрано на фабрике";
    }
}
