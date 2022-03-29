package lb6;

import lb1.structure.Hats;
import lb1.structure.Jackets;
import lb1.structure.Pants;

import java.util.ArrayList;

public interface AbstractFactory {
    Hats createHat(int type);
    Jackets createJacket(int type);
    Pants createPants(int type);
}

