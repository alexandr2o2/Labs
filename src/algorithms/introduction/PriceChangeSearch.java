package algorithms.introduction;

import java.util.ArrayList;

public class PriceChangeSearch{
    public static void main(String[]args){
        ArrayList<Double> l = new ArrayList<Double>();
        for (int i = 0; i < 100000; i++){
            l.add(100 * Math.random());
        }

        for (int j =0;j<=10;j++) {
            long t = System.currentTimeMillis();

            for (int i = 0; i <= 1000; i++) {
                int[] s = PriceChangeSearch.firstAl(l);
            }

            System.out.println("Номер эксперемента " + j + " // Время выполнения: " + ((System.currentTimeMillis() - t)));
        }
    }
    public static int[] firstAl(ArrayList<Double> l){
        int[] spans = new int[l.size()];
        for (int i = 0; i < l.size(); i++){
            int k = 1;
            boolean span_end = false;
            while ( ( i-k >= 0) && (!span_end)) {
                if (l.get(i - k) <= l.get(i)) {
                    k = k + 1;
                } else {
                    span_end = true;
                }
            }
            spans[i] = k;
        }

        return spans;
    }
    public int secondAl(ArrayList<Double> l ){
        return  1;
    }
}
