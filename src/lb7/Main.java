package lb7;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Room[] roomes1 = new Room[10];
        for (int i = 0; i < 10; i++){
            roomes1[i] = Room.generate( i,i*10);
        }

//        for (Room a: roomes1) {
//            System.out.println(a.getType());
//            System.out.println(a.getSize());
//        }

        ArrayList<Room> rooms2 = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            rooms2.add(Room.generate( i,i*10));
        }

        ArrayList<Room> rooms3 = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            rooms3.add(Room.generate( i,i*10));
        }

        LinkedList<Room> rooms4 = new LinkedList<>();
        for (int i = 0; i < 10; i++){
            rooms4.add(Room.generate( i,i*10));
        }

        Building building = new Building(roomes1,rooms2,rooms3,rooms4);

        counter(building);
        counter("\nПощадь жилых помещений: ", RoomType.Living_room, building);
        counter("\nПощадь хранилищ: ", RoomType.Storage, building);
        counter("\nПощадь магазинов: ", RoomType.Shop, building);
        counter("\nПощадь пр. помещений: ", RoomType.Production_room, building);
        counter("\nПощадь офисов: ", RoomType.Office, building);

    }

    public static void counter(String str,RoomType type, Building building){
        double square = 0;
        Iterator iterator = building.getIterator();
        while (iterator.hasNext()){
            Room r = (Room) iterator.next();
            if (r.getType() == type)
                square += r.getSize();
        }
        System.out.println(str + square);
    }

    public static void counter(Building building){
        double square = 0;
        Iterator iterator = building.getIterator();
        while (iterator.hasNext()){
            Room r = (Room) iterator.next();
            square += r.getSize();
        }
        System.out.println("\nОбщая площадь: " + square);
    }
}
