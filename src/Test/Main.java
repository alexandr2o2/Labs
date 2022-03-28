package Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String str = "(45* 78*15-57 /5)/0\n" +
                "45*78 *15-57/5\n" +
                "12+14+68+98\n" +
                "ф + (v +c) /a\n" +
                "sin(10)+cos(10)\n" +
                "Sin(10)+Cos(10*Sin()))\n" +
                "()";
        Pattern pBrack = Pattern.compile("\\(.+?\\)");
        Matcher m = pBrack.matcher(str);
        //m.
        System.out.println(str);
        System.out.println(str);

    }
    public static void simpleEq(String str){

    }
}
