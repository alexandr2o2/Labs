package lb2;

class Consumer implements Runnable {

    private int input = 10;
    private Storage storage;

    public void addStorage(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        while (true) {
            if (storage.removeNumOfProduct(input)) {
                System.out.println("Потреблен товар. Количество товара на складе " + storage.getNumOfProduct());
            } else {
                System.out.println("Cклад пуст!");

                while (true){
                    storage.setFlag(false);
                    if (storage.getNumOfProduct() > storage.getCapacity()/2) {
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
