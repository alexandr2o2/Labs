package lb7;

import lb4.Comp.Type;

public class Room {
    private RoomType type;
    private double size;

    public Room(RoomType type, double size) {
        this.type = type;
        this.size = size;
    }

    public static Room generate(int type,double size) {
        if (type > 8){
            return new Room(RoomType.Living_room,size);
        } else if (type > 6){
            return new Room(RoomType.Production_room,size);
        } else if (type > 4){
           return new Room(RoomType.Office,size);
        }else if (type > 2){
            return new Room(RoomType.Shop,size);
        } else {
            return new Room(RoomType.Storage,size);
        }
    }

    public RoomType getType() {
        return type;
    }

    public void setType(RoomType type) {
        this.type = type;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
