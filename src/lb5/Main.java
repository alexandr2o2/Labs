package lb5;

import lb1.structure.*;

import java.util.ArrayList;

public class Main {
    public static void main(String args[]){

        int n = (int)(12+Math.random()*88);
        System.out.println("Длинна массива "+n);
        Clothes[] list = new Clothes[n];
        for (int i=0;i<n;i++){
            int k = (int) (Math.random()*12);
            list[i] = ClothesFactory.creatClothes(k);
        }
        for (Clothes clothes : list) System.out.println(clothes.getDescription());

    }
}
