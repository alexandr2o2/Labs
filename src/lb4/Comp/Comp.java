package lb4.Comp;

import java.util.List;

public class Comp {
    public static double getAnswer(String textLine){
        double answer;
        //textLine = textLine.replaceAll("\s+","");
        List<Phrase> phrases = Phrase.separate(textLine);
        PhraseBuffer phraseBuffer = new PhraseBuffer(phrases);
        answer = Comp.expr(phraseBuffer);
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
