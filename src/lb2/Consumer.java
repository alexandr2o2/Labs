package lb2;

class Consumer implements Runnable {

    private int input = 10;
    private Storage storage;
    private boolean flag = false;

    synchronized void stop(){
        flag = true;
    }
    synchronized void proceed(){
        flag = false;
        notify();
    }

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
                flag = true;

            }
            try {
                while (flag){
                    wait();
                }
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
