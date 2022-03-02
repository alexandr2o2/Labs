package lb2;


class Manufacturer implements Runnable{

    private int output = 5;
    private Storage storage;
    private boolean flag = false;

    synchronized void stop(){
        flag = false;
    }
    synchronized void proceed(){
        flag = true;
        notify();
    }

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
                flag = true;
            }
            try {
                while (flag){
                    wait();
                }
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

