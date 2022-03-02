package lb3;

import lb1.structure.*;

import java.util.ArrayList;

public class Main {
    static public void main(String[] args){
        // Случайная длинна массива
        int n = (int)(12+Math.random()*88);
        System.out.println("Длинна массива "+n);
        ClothesIF[] list = new ClothesIF[n];

        // Константы для цикла
        // Материалы
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
        // Размеры
        int s1 = 10;
        int s2 = 15;
        int s3 = 20;


        for (int i=0;i<list.length;i++) {
            int k = (int) (Math.random()*12);
            if (k == 0){
                list[i]= new Ironing(new Bloomers(mat1,s1,5));

            }
            else if ( k == 1){
                list[i]= new Ironing(new Down_jacket(mat2,s3,5,4,true));
            }
            else if (k == 2){
                list[i] = new Ironing(new Captain_hat(mat2,s2,5));
            }
            else if (k == 3){
                list[i] = new Ironing(new Baseball_cap(mat1,s2,5));
            }
            else if (k == 4){
                list[i] = new Ironing(new Helmet(mat3,s2,5));
            }
            else if (k == 5){
                list[i] = new Ironing(new Chinos(mat3,s2,5));
            }
            else if (k == 6){
                list[i] = new Ironing(new Jeans(mat3,s3,5));
            }
            else if (k == 7){
                list[i] = new Ironing(new Buggy_pants(mat1,s1,5));
            }
            else if (k == 8){
                list[i] = new Ironing(new Bermuda_shorts(mat1,s2,5));
            }
            else if (k == 9){
                list[i] = new Ironing(new Windcheater(mat3,s2,5,8,true));
            }
            else if (k == 10){
                list[i] = new Ironing(new Flight_jacket(mat2,s1,5,2,true));
            }
            else if (k == 11){
                list[i] = new Ironing(new Fur_coat(mat2,s2,5,4,false));
            }
            else if (k == 12){
                list[i] = new Ironing(new French_cap(mat3,s3,5));
            }
        }
        for (ClothesIF clothes : list) System.out.println(clothes.getDescription());

        ClothesIF l = new Ironing(new Buggy_pants(mat1,s1,5));

    }
}
