package lb1;

import lb1.structure.Bloomers;
import lb1.structure.Clothes;
import lb1.structure.Down_jacket;

import java.util.ArrayList;

public class Main {
    static public void main(String[] args){
        int n = (int)(Math.random()*10);
        System.out.println("Рандомное число "+n);
        Clothes[] list = new Clothes[n];

        for (int i=0;i<list.length;i++) {
            double k = Math.random();
            if (k < 0.5){
                ArrayList<String> mat = new ArrayList<>();
                mat.add("Джинса");

                list[i]= new Bloomers(mat,15,5);
            }
            else if ( k >= 0.5){
                ArrayList<String> mat = new ArrayList<>();
                mat.add("Джинса");

                list[i]= new Down_jacket(mat,15,5,4,true);
            }

        }
        for (Clothes clothes : list) System.out.println(clothes.getDescription());
    }
}
