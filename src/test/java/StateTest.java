import org.junit.jupiter.api.Test;
import com.javarush.quest.laptev.model.State;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StateTest {

    @Test
    public void testNextState() {
        State state1 = new State("1");
        State state2 = new State("2");
        State state3 = new State("3");
        state1.setNextStates(state2, state3);
        State expected = state2;
        State actual = state1.nextState("one");
        assertEquals(expected, actual);
    }

    @Test
    public void testGetLabel() {
        State state1 = new State("label");
        String expected = "label";
        String actual = state1.getLabel();
        assertEquals(expected, actual);
    }
}
