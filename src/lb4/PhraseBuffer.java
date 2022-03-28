package lb4;

import java.util.List;

public class PhraseBuffer {
    private int i = 0;
    public List<Phrase>  phrases;

    public PhraseBuffer(List<Phrase> phrases) {
        this.phrases = phrases;
    }
    public Phrase next(){
        return phrases.get(i++);
    }
    public void back(){
        i--;
    }
    public int getI(){
       return  i;
    }
}
