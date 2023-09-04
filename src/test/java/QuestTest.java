import jakarta.xml.bind.JAXBException;
import org.junit.jupiter.api.Test;
import com.javarush.quest.laptev.model.Quest;

import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.ResourceBundle;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuestTest {

    Locale locale = new Locale("ru", "RU");
    ResourceBundle rb = ResourceBundle.getBundle("text", locale);

    @Test
    public void TestConstructor() throws JAXBException, FileNotFoundException {
        Quest quest = new Quest();
        String expected = "1";
        String actual = quest.getCurrentState().getLabel();
        assertEquals(expected, actual);
    }

    @Test
    public void testStart() throws JAXBException, FileNotFoundException {
        Quest quest = new Quest();
        quest.start();
        int expected = 1;
        int actual = quest.getLevel();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetUser() throws JAXBException, FileNotFoundException {
        Quest quest = new Quest();
        quest.setUser("Name");
        String expected = "Name";
        String actual = quest.getUser();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetIpAddress() throws JAXBException, FileNotFoundException {
        Quest quest = new Quest();
        quest.setIpAddress("192.168.0.23");
        String expected = "192.168.0.23";
        String actual = quest.getIpAddress();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetNumberGame() throws JAXBException, FileNotFoundException {
        Quest quest = new Quest();
        quest.setNumberGames(3);
        int expected = 3;
        int actual = quest.getNumberGames();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetLevel() throws JAXBException, FileNotFoundException {
        Quest quest = new Quest();
        quest.setLevel(4);
        int expected = 4;
        int actual = quest.getLevel();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetQuestion() throws JAXBException, FileNotFoundException {
        Quest quest = new Quest();
        String expected = rb.getString("question_1");
        String actual = quest.getQuestion();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetAnswerOne() throws JAXBException, FileNotFoundException {
        Quest quest = new Quest();
        String expected = rb.getString("answerOne_1");
        String actual = quest.getAnswerOne();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetAnswerTwo() throws JAXBException, FileNotFoundException {
        Quest quest = new Quest();
        String expected = rb.getString("answerTwo_1");
        String actual = quest.getAnswerTwo();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetMessage() throws JAXBException, FileNotFoundException {
        Quest quest = new Quest();
        String expected = rb.getString("message_Default");
        String actual = quest.getMessage();
        assertEquals(expected, actual);
    }
}
