package lb4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Comp {

    public static double getAnswer1(String textLine) {
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
    public static double getAswer2(String textLine){
        double answer = 0;
        Pattern pEmpty = Pattern.compile("LOL");
        Pattern pBrack = Pattern.compile("(.*)");
        Pattern pNumber = Pattern.compile("[0-9]+");
        Pattern pAction = Pattern.compile("([0-9])*[\\+\\*-/]([0-9])");
        Matcher matcher = pBrack.matcher(textLine);

        return answer;
    }
}
