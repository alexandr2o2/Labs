package lb6;

import lb1.structure.*;

import java.util.ArrayList;

public class SummerClothesFactory implements AbstractFactory {
    // Фабрика зимней одежды
    int s1 = 10;
    int s2 = 15;
    int s3 = 20;
    ArrayList<String> mat1 = new ArrayList<>();
    ArrayList<String> mat2 = new ArrayList<>();
    ArrayList<String> mat3 = new ArrayList<>();
    public SummerClothesFactory() {
        mat1.add("Джинса");
        mat1.add("Нитки");
        mat2.add("Хлопок");
        mat2.add("Шерсть");
        mat3.add("Вискоза");
        mat3.add("Полиэстер");
        mat3.add("Спандекс");
    }

    public Clothes[] createSet(int type1, int type2, int type3){
        Clothes[] listOfC = new Clothes[3];
        listOfC[1] = createHat(type1);
        listOfC[2] = createJacket(type2);
        listOfC[3] = createPants(type3);
        return listOfC;
    }



    @Override
    public Hats createHat(int type) {
        if (type == 1){
            return new Baseball_cap(mat1,s1,s2);
        } else if (type == 2){
            return new French_cap(mat2,s1,s2);
        } else {
            return new Helmet(mat2,s1,s2);
        }
    }

    @Override
    public Jackets createJacket(int type) {
        if (type == 1){
            return new Down_jacket(mat1,s1,45,10,true);
        } else{
            return new Windcheater(mat3,s1,13,15,true);
        }
    }

    @Override
    public Pants createPants(int type) {
        if (type == 1){
            return new Buggy_pants(mat2,s1,5);
        } else if (type == 2){
            return new Bloomers(mat3,s2,13);
        } else {
            return new Bermuda_shorts(mat3,s2,13);
        }
    }
}
