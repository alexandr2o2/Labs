package lb2;

public class Main {
    static public void main(String[] args){

        Thread consumer = new Thread(new Consumer());
        consumer.start();
        Thread manufacturer = new Thread(new Manufacturer());
        manufacturer.start();

    }
}

class Manufacturer implements Runnable{

    private int output = 10;

    @Override
    public void run(){
        System.out.println("Производитель");
        System.out.println("Имя потока: "+Thread.currentThread().getName());
    }
}

class Consumer implements Runnable{

    private int input = 5;

    @Override
    public void run(){
        System.out.println("Потребитель ");
        System.out.println("Имя потока: "+Thread.currentThread().getName());
    }
}
