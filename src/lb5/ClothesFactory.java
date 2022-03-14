package lb5;

import lb1.structure.*;

import java.util.ArrayList;

public class ClothesFactory extends Factory {
    public  Clothes creatClothes(int type){

        int s1 = 10;
        int s2 = 15;
        int s3 = 20;
        ArrayList<String> mat1 = new ArrayList<>();
        mat1.add("Джинса");
        mat1.add("Нитки");
        ArrayList<String> mat2 = new ArrayList<>();
        mat2.add("Хлопок");
        mat2.add("Шерсть");
        ArrayList<String> mat3 = new ArrayList<>();
        mat3.add("Вискоза");
        mat3.add("Полиэстер");
        mat3.add("Спандекс");
        Clothes clothes = null;

        if (type == 0){
            clothes = new Bloomers(mat1,s1,5);
        }
        else if (type == 1){
            clothes = new Down_jacket(mat2,s3,5,4,true);
        }
        else if (type == 2){
            clothes = new Captain_hat(mat2,s2,5);
        }
        else if (type == 3){
            clothes = new Baseball_cap(mat1,s2,5);
        }
        else if (type == 4){
            clothes = new Helmet(mat3,s2,5);
        }
        else if (type == 5){
            clothes = new Chinos(mat3,s2,5);
        }
        else if (type == 6){
            clothes = new Jeans(mat3,s3,5);
        }
        else if (type == 7){
            clothes = new Buggy_pants(mat1,s1,5);
        }
        else if (type == 8){
            clothes = new Bermuda_shorts(mat1,s2,5);
        }
        else if (type == 9){
            clothes = new Windcheater(mat3,s2,5,8,true);
        }
        else if (type == 10){
            clothes = new Flight_jacket(mat2,s1,5,2,true);
        }
        else if (type == 11){
            clothes = new Fur_coat(mat2,s2,5,4,false);
        }
        else if (type == 12){
            clothes = new French_cap(mat3,s3,5);
        }

        return clothes;
    }
}
