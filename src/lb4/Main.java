package lb4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String args[]) {
        File f = new File("src" + File.separator + "lb4" + File.separator + "data");
        double answer = 0;
        try {
            Scanner scanner = new Scanner(f);
            while (scanner.hasNext()) {
                String text = scanner.nextLine();
                answer += getAnswer(text);
            }
            System.out.println("Ответ: " + answer);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static double getAnswer(String textLine) {
        Pattern p = Pattern.compile("([\\+\\*-/])*([\\s\\n])*([0-9]+)([\\s\\n])*", Pattern.MULTILINE);
        Matcher matcher = p.matcher(textLine);
        double answer = 0;
        while (matcher.find()) {
            double num = Double.parseDouble(matcher.group(3));
            System.out.println("Цифра: " + num);
            System.out.println("Дейсвие: " + matcher.group(1));
            String sep = matcher.group(1);
            if (sep == null) {
                System.out.println("Начало");
                answer = num;
                continue;
            }
            if (sep.equals("+")) {
                System.out.println("Суммировано");
                answer += num;
            } else if (sep.equals("-")) {
                System.out.println("Найдена разность");
                answer -= num;
            } else if (sep.equals("/")) {
                System.out.println("Найдено отношение");
                answer = answer / num;
            } else if (sep.equals("*")) {
                System.out.println("Умножено");
                answer *= num;
            }
        }
        return answer;
    }
}
