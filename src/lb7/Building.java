package lb7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Building implements Collection {
    private Room[] floor1 = new Room[10];
    private ArrayList<Room> floor2 = new ArrayList<>();
    private List<Room> floor3 = new ArrayList<>();
    private LinkedList<Room> floor4 = new LinkedList<>();

    public Building(Room[] floor1, ArrayList<Room> floor2, List<Room> flour3, LinkedList<Room> flour4) {
        this.floor1 = floor1;
        this.floor2 = floor2;
        this.floor3 = flour3;
        this.floor4 = flour4;
    }

    public Room[] getFloor1() {
        return floor1;
    }

    public void setFloor1(Room[] floor1) {
        this.floor1 = floor1;
    }

    public ArrayList<Room> getFloor2() {
        return floor2;
    }

    public void setFloor2(ArrayList<Room> floor2) {
        this.floor2 = floor2;
    }

    public List<Room> getFloor3() {
        return floor3;
    }

    public void setFloor3(List<Room> floor3) {
        this.floor3 = floor3;
    }

    public LinkedList<Room> getFlour4() {
        return floor4;
    }

    public void setFlour4(LinkedList<Room> flour4) {
        this.floor4 = flour4;
    }

    @Override
    public Iterator getIterator() {
        return new RoomIterator();
    }
    private class RoomIterator implements Iterator{
        private int index;
        private int len;
        private int lenF1;
        private int lenF2;
        private int lenF3;
        private int lenF4;


        public RoomIterator() {
            lenF1 = floor1.length;
            lenF2 = floor2.size();
            lenF3 = floor3.size();
            lenF4 = floor4.size();
            len = lenF1 + lenF2 + lenF3 + lenF4;
        }

        @Override
        public boolean hasNext() {
            return index < len;
        }

        @Override
        public Object next() {
            if (index < lenF1){
                return floor1[index++];
            } else if ( (index >= lenF1) && (index < (lenF1+lenF2))){
                index++;
                return floor2.get(index - 1 - lenF1);
            } else if (index >= (lenF1+lenF2) && index < (lenF1+lenF2+lenF3)){
                index++;
                return floor2.get(index - 1 - lenF1 - lenF2);
            } else {
                index++;
                return floor2.get(index - 1 - lenF1 - lenF2 - lenF3);
            }
        }
    }
}
