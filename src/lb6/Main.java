package lb6;

import lb1.structure.Clothes;
import lb5.ClothesFactory;
import lb5.Factory;

public class Main {
    public static void main(String[] args) {
        int n = 9;
        System.out.println("Длинна массива " + n);
        Clothes[] list = new Clothes[n];
        AbstractFactory winterClothes = new WinterClothesFactory();
        AbstractFactory summerClothes = new SummerClothesFactory();
        System.out.println("\nОдежда летом\n");
        for (int i = 0; i <= n-3; i += 3) {
            int k1 = (int) (1 + Math.random() * 3);
            int k2 = (int) (1 + Math.random() * 3);
            int k3 = (int) (1 + Math.random() * 3);
            list[i] = summerClothes.createPants(k1);
            list[i + 1] = summerClothes.createHat(k2);
            list[i + 2] = summerClothes.createJacket(k3);
        }
        for (Clothes a : list) System.out.println(a.getDescription());
        System.out.println("\nОдежда зимой\n");
        for (int i = 0; i < n; i += 3) {
            int k1 = (int) (1 + Math.random() * 3);
            int k2 = (int) (1 + Math.random() * 3);
            int k3 = (int) (1 + Math.random() * 3);
            list[i] = winterClothes.createPants(k1);
            list[i + 1] = winterClothes.createHat(k2);
            list[i + 2] = winterClothes.createJacket(k3);
        }
        for (Clothes a : list) System.out.println(a.getDescription());
    }
}
