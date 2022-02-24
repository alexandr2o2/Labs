package lb2;

public class Storage {

    Storage(int numOfProduct){
        this.numOfProduct = numOfProduct;
    }
    public int getNumOfProduct() {
        return numOfProduct;
    }

    public synchronized void setNumOfProduct(int numOfProduct) {
        this.numOfProduct = numOfProduct;
    }

    private volatile int numOfProduct;
    private int capacity = 1000;

    public synchronized boolean addNumOfProduct(int numOfProduct){
        if (this.numOfProduct < capacity - numOfProduct){
            this.numOfProduct = this.numOfProduct + numOfProduct;
            return true;
        }
        else
            return false;
    }
    public synchronized boolean removeNumOfProduct(int numOfProduct){
        if (this.numOfProduct - numOfProduct > 0){
            this.numOfProduct = this.numOfProduct - numOfProduct;
            return true;
        }
        else
            return false;
    }
}
