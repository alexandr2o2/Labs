package lb4;

import java.util.ArrayList;
import java.util.List;
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
    public static double getAnswer2(String textLine){
        double answer = 0;

        /*------------------------------------------------------------------
         * PARSER RULES
                *------------------------------------------------------------------*/

//    expr : plusminus* EOF ;
//
//    plusminus: multdiv ( ( '+' | '-' ) multdiv )* ;
//
//    multdiv : factor ( ( '*' | '/' ) factor )* ;
//
//    factor : NUMBER | '(' expr ')' ;

        textLine = textLine.replaceAll("\s+","");
        Pattern pLetters = Pattern.compile("[a-zA-Z]+");
        String tempLine = textLine.replaceAll("([Ss]in)|([Cc]os)",
                "");





        return answer;
    }
    public static double expr(PhraseBuffer phrases){
        Phrase phrase = phrases.next();
        if (phrase.type == Type.End) {
            return 0;
        } else {
            phrases.back();
            return plusminus(phrases);
        }

    }
    public static double plusminus(PhraseBuffer phrases){
        double value = multdiv(phrases);
        while (true){
            Phrase phrase = phrases.next();
            if (phrase.type == Type.Plus){
                value += multdiv(phrases);
            } else if (phrase.type == Type.Minus){
                value -= multdiv(phrases);
            } else if ((phrase.type == Type.Br_R) ||(phrase.type == Type.End)){
                phrases.back();
                return value;
            } else {
               throw new RuntimeException("Unexpected token: " + phrase.text
                        + " at position: " + phrases.getI());
            }
        }
    }
    public static double multdiv(PhraseBuffer phrases){
        double value = factor(phrases);
        while (true){
            Phrase phrase = phrases.next();
            if (phrase.type == Type.Pr){
                value *= factor(phrases);
            } else if (phrase.type == Type.Div){
                value /= factor(phrases);
            } else if (
                    (phrase.type == Type.End) ||(phrase.type == Type.Br_R)||
                    (phrase.type == Type.Plus) ||(phrase.type == Type.Minus)
            ) {
                phrases.back();
                return value;
            } else {
                throw new RuntimeException("Unexpected token: " + phrase.text
                        + " at position: " + phrases.getI());
            }
        }
    }
    public static double factor(PhraseBuffer phrases){
        Phrase phrase = phrases.next();
        if (phrase.type == Type.Number){
            return Double.parseDouble(phrase.text);
        }else if (phrase.type == Type.Br_L){
            double value = expr(phrases);
            phrase = phrases.next();
            if (phrase.type != Type.Br_R){
                throw new RuntimeException("Неверное выражение: " + phrase.text + phrases.getI());
            }
            return value;
        } else {
            throw new RuntimeException("Проблемы с синтаксисом");
        }
    }
}
