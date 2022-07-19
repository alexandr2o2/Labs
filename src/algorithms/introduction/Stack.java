package algorithms.introduction;

import java.util.ArrayList;

public class Stack {
    ArrayList<Double> list = new ArrayList<Double>();
    public Stack(){
        System.out.println("Создан Stack");
    }
    public double pop() throws Exception {
        int s = list.size();
        double val;
        if (s == 0) {
            throw new Exception("Лол элементов в стаке нет))))))))");
        } else {
            val = list.get((s - 1));
            list.remove(s - 1);
        }
        return val;
    }
    public boolean IsStackEmpty(){
        return list.size() > 0;
    }
    public void push(double n){
        list.add(n);
    }
    public double top() throws Exception {
        int s = list.size();
        double val;
        if (s == 0) {
            throw new Exception("Лол элементов в стаке нет))))))))");
        } else {
            val = list.get((s - 1));
        }
        return val;
    }
    public int whatSize() {return list.size();}
}
