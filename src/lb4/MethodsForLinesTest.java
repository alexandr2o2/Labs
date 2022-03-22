package lb4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodsForLinesTest {

    @Test
    void getAnswer1() {
        String text = "12+14+68+98";
        double answer = Comp.getAnswer1(text);
        assertEquals(192,answer);
    }
    @Test
    void getAnswer2() {
        String text = "12+(14+68)/98";
        double answer = Comp.getAnswer1(text);
        assertEquals(12.8367346,answer);
    }
    @Test
    void getAnswer3() {
        String text = "12/14+68*98";
        double answer = Comp.getAnswer1(text);
        assertEquals(6664.85714,answer);
    }
    @Test
    void getAnswer4() {
        String text = "45*78*15-57/5";
        double answer = Comp.getAnswer1(text);
        assertEquals(52638.6,answer);
    }
    @Test
    void getAnswer5() {
        String text = "(45*78*15-57/5)*0";
        double answer = Comp.getAnswer1(text);
        assertEquals(0,answer);
    }
    @Test
    void getAnswer6() {
        String text = "(45*78*15-57/5)/0";
        double answer = Comp.getAnswer1(text);
        assertThrows(Exception e = new L, Comp.getAnswer1(text));

    }
}