package lb2;


class Manufacturer implements Runnable{

    private int output = 5;
    private Storage storage;

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
                while (true){
                    storage.setFlag(true);
                    if (storage.getNumOfProduct() < storage.getCapacity()/2) {
                        break;
                    }
                }
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}