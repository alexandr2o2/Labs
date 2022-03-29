package lb4;

import lb4.Comp.Comp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        File f = new File("src" + File.separator + "lb4" + File.separator + "data");
        try {
            Scanner scanner = new Scanner(f);
            while (scanner.hasNext()) {
                String text = scanner.nextLine();
                System.out.println("Ответ: " + Comp.getAnswer(text));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
