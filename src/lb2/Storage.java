package lb2;

import java.util.ArrayList;
import java.util.List;

public class Storage {

    public void addMembersM(Manufacturer manufacturer) {
        this.membersM = manufacturer;
    }
    public void addMembersC(Consumer consumer) {
        this.membersC = consumer;
    }

    private Consumer membersC;
    private Manufacturer membersM;


    Storage(int numOfProduct){
        this.numOfProduct = numOfProduct;
    }
    public synchronized int getNumOfProduct() {
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
            if (this.numOfProduct > capacity/2){
                membersC.proceed();
            }
            return true;
        }
        else
            membersC.stop();
            return false;
    }
    public synchronized boolean removeNumOfProduct(int numOfProduct){
        if (this.numOfProduct - numOfProduct > 0){
            this.numOfProduct = this.numOfProduct - numOfProduct;
            if (this.numOfProduct < capacity/2){
                membersM.proceed();
            }
            return true;
        }
        else
            membersM.stop();
            return false;
    }
}
