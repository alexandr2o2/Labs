package lb2;

public class Storage {

    private int numOfProduct;
    private final int capacity = 1000;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    boolean flag = false;

    Storage(int numOfProduct){
        this.numOfProduct = numOfProduct;
    }

    public synchronized int getNumOfProduct() {
        return numOfProduct;
    }

    public synchronized void setNumOfProduct(int numOfProduct) {
        this.numOfProduct = numOfProduct;
    }

    public int getCapacity() {
        return capacity;
    }

    public synchronized boolean addNumOfProduct(int numOfProduct){
        while (flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (this.numOfProduct < capacity - numOfProduct){
            this.numOfProduct = this.numOfProduct + numOfProduct;
            flag = true;
            notify();
            return true;
        }
        else {
            flag = true;
            notify();
            return false;
        }
    }

    public synchronized boolean removeNumOfProduct(int numOfProduct){
        while (!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (this.numOfProduct - numOfProduct > 0){
            this.numOfProduct = this.numOfProduct - numOfProduct;
            flag = false;
            notify();
            return true;
        }
        else {
            flag = false;
            notify();
            return false;
        }
    }
}
