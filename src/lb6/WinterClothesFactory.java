package lb6;

import lb1.structure.*;

import java.util.ArrayList;

public class WinterClothesFactory implements AbstractFactory {
    // Фабрика зимней одежды
    int s1 = 10;
    int s2 = 15;
    int s3 = 20;
    ArrayList<String> mat1 = new ArrayList<>();
    ArrayList<String> mat2 = new ArrayList<>();
    ArrayList<String> mat3 = new ArrayList<>();
    public WinterClothesFactory() {
        mat1.add("Джинса");
        mat1.add("Нитки");
        mat2.add("Хлопок");
        mat2.add("Шерсть");
        mat3.add("Вискоза");
        mat3.add("Полиэстер");
        mat3.add("Спандекс");
    }

    public ArrayList<Clothes> createSet(int type1, int type2, int type3){
        ArrayList<Clothes> listOfC = new ArrayList<>();
        listOfC.add(createHat(type1));
        listOfC.add(createJacket(type2));
        listOfC.add(createPants(type3));
        return listOfC;
    }



    @Override
    public Hats createHat(int type) {
        if (type == 1){
            return new Captain_hat(mat1,s1,s2);
        } else {
            return new Mask(mat2,s1,s2);
        }
    }

    @Override
    public Jackets createJacket(int type) {
        if (type == 1){
            return new Fur_coat(mat1,s1,45,10,true);
        } else {
            return new Flight_jacket(mat3,s1,13,15,true);
        }
    }

    @Override
    public Pants createPants(int type) {
        if (type == 1){
            return new Jeans(mat2,s1,5);
        } else {
            return new Chinos(mat3,s2,13);
        }
    }
}
