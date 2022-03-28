package lb4;

import lb4.Comp.Comp;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodsForLinesTest {

    @Test
    void getAnswer1() {
        String text = "12+14+68+98";
        double answer = Comp.getAnswer2(text);
        assertEquals(192,answer);
    }
    @Test
    void getAnswer2() {
        String text = "12+(14+68)/98";
        double answer = Comp.getAnswer2(text);
        assertEquals(12.8367347,answer);
    }
    @Test
    void getAnswer3() {
        String text = "12/14+68*98";
        double answer = Comp.getAnswer2(text);
        assertEquals(6664.857143,answer);
    }
    @Test
    void getAnswer4() {
        String text = "45*78*15-57/5";
        double answer = Comp.getAnswer2(text);
        assertEquals(52638.6,answer);
    }
    @Test
    void getAnswer5() {
        String text = "(45*78*15-57/5)*0";
        double answer = Comp.getAnswer2(text);
        assertEquals(0,answer);
    }
//
//    @Test
//
//    void getAnswer6() {
//        String text = "(45*78*15-57/5)/0";
//        double answer = Comp.getAnswer2(text);
////        assertThrows(Exception e = new L, Comp.getAnswer1(text));
//
//    }
}