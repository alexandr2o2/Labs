package lb2;

public class Main {
    static public void main(String[] args){

        Storage storage = new Storage(250);
        Consumer consumer = new Consumer();
        Manufacturer manufacturer = new Manufacturer();

        consumer.addStorage(storage);
        manufacturer.addStorage(storage);

        Thread manufacturerThread = new Thread(manufacturer);
        Thread consumerThread = new Thread(consumer);

        manufacturerThread.start();
        consumerThread.start();

    }
}
