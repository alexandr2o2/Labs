package lb2;

public class Main {
    static public void main(String[] args){

        Storage storage = new Storage(250);

        Consumer consumer = new Consumer();
        consumer.addStorage(storage);

        Manufacturer manufacturer = new Manufacturer();
        manufacturer.addStorage(storage);

        Thread manufacturerThread = new Thread(manufacturer);
        manufacturerThread.start();

        Thread consumerThread = new Thread(consumer);
        consumerThread.start();

    }
}

class Manufacturer implements Runnable{

    private int output = 5;
    Storage storage;

    public void addStorage(Storage storage){
        this.storage = storage;
    }

    @Override
    public void run(){
        while (true){
            if (storage.addNumOfProduct(output)) {
                System.out.println("Произведен товар. Количество товара на складе " + storage.getNumOfProduct());
            }
            else {
                System.out.println("Произведен товар. Cклад полн!!");
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable{

    private int input = 10;
    Storage storage;

    public void addStorage(Storage storage){
        this.storage = storage;
    }

    @Override
    public void run(){
        while (true){
            if(storage.removeNumOfProduct(input)) {
                System.out.println("Потреблен товар. Количество товара на складе " + storage.getNumOfProduct());
            }
            else {
                System.out.println("Cклад пуст!");
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
