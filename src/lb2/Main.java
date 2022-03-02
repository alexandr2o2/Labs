package lb2;

public class Main {
    static public void main(String[] args){

        Storage storage = new Storage(250);

        Consumer consumer = new Consumer();
        consumer.addStorage(storage);

        Manufacturer manufacturer = new Manufacturer();
        manufacturer.addStorage(storage);

        storage.addMembersC(consumer);
        storage.addMembersM(manufacturer);

        Thread manufacturerThread = new Thread(manufacturer);
        manufacturerThread.start();

        Thread consumerThread = new Thread(consumer);
        consumerThread.start();

    }
}
