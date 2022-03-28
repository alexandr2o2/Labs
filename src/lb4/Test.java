package lb4;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String str = "(2+4)/5-(57-14)*10+(5*8)";
        List<Phrase> phrases = Phrase.separate(str);
        System.out.println(str);
        for (Phrase a : phrases){
            System.out.print(a.text + ", ");
        }
        System.out.println();
        for (Phrase a : phrases){
            System.out.print(a.type + ", ");
        }
        System.out.println();
        PhraseBuffer phraseBuffer = new PhraseBuffer(phrases);
        System.out.println(Comp.expr(phraseBuffer));
    }
}
