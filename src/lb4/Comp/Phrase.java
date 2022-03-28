package lb4.Comp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Phrase {
    Type type;
    String text;
    static ArrayList<Integer> num;


    public Phrase(Type type, String text) {
        this.type = type;
        this.text = text;
    }

    public static List<Phrase> separate(String text){
        num = new ArrayList<>();
        Pattern br_L = Pattern.compile("\\(");
        Pattern br_R = Pattern.compile("\\)");
        Pattern pNumber = Pattern.compile("[0-9]+");
        Pattern pAction = Pattern.compile("[\\+\\*\\/-]");
        Matcher m;
        m = br_L.matcher(text);
        while (m.find()){
            num.add(m.start());
        }
        m = br_R.matcher(text);
        while (m.find()){
            num.add(m.start());
        }
        m = pNumber.matcher(text);
        while (m.find()){
            num.add(m.start());
        }
        m = pAction.matcher(text);
        while (m.find()){
            num.add(m.start());
        }
        //System.out.println(num.size());
        Collections.sort(num);
        //System.out.println(num);
        Phrase[] phrases = new Phrase[num.size()+1];
        m = br_L.matcher(text);
        while (m.find()){
            phrases[num.indexOf(m.start())] = new Phrase(Type.Br_L,text.substring(m.start(), m.end()));
        }
        m = br_R.matcher(text);
        while (m.find()){
            phrases[num.indexOf(m.start())] = new Phrase(Type.Br_R,text.substring(m.start(), m.end()));
        }
        m = pNumber.matcher(text);
        while (m.find()){
            phrases[num.indexOf(m.start())] = new Phrase(Type.Number,text.substring(m.start(), m.end()));
        }
        m = pAction.matcher(text);
        while (m.find()){
            String tempString = text.substring(m.start(), m.end());
            if (tempString.equals("+")){
                phrases[num.indexOf(m.start())] = new Phrase(Type.Plus,tempString);
            } else if (tempString.equals("*")){
                phrases[num.indexOf(m.start())] = new Phrase(Type.Pr,tempString);
            }else if (tempString.equals("-")) {
                phrases[num.indexOf(m.start())] = new Phrase(Type.Minus, tempString);
            }else if (tempString.equals("/")) {
                phrases[num.indexOf(m.start())] = new Phrase(Type.Div, tempString);
            }
        }
        phrases[phrases.length-1] = new Phrase(Type.End,"");
        List<Phrase> listOfphrases = new ArrayList<>();
        Collections.addAll(listOfphrases, phrases);
        return listOfphrases;
    }
}
