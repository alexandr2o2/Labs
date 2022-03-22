package lb4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        File f = new File("src" + File.separator + "lb4" + File.separator + "data");
        double answer = 0;
        try {
            Scanner scanner = new Scanner(f);
            while (scanner.hasNext()) {
                String text = scanner.nextLine();
                answer += Comp.getAnswer1(text);
            }
            System.out.println("Ответ: " + answer);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
