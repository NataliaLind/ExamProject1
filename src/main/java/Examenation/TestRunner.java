package Examenation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TestRunner {
    @Test
    public void testGetSum() {
//Arrange <- Vi arrangerar vår testdata
        Logic lines = new Logic();
        lines.setSum("I like swimming");
        lines.setSum("Hello");
        lines.setSum("stop");
        int expected = 2;
//Act <- Vi utför nödvändiga beräkningar etc.
        int actual = lines.getSum();
//Assert <- Vi kollar att vi får korrekt utfall.

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetCharacters() {
//Arrange <- Vi arrangerar vår testdata
        Logic lines = new Logic();
        lines.setCharacters("I like swimming");
        lines.setCharacters("Hello");
        lines.setCharacters("stop");
        int expected = 20;
//Act <- Vi utför nödvändiga beräkningar etc.
        int actual = lines.getCharacters();
//Assert <- Vi kollar att vi får korrekt utfall.

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void TestGetLongestWord() {
//Arrange <- Vi arrangerar vår testdata
        Logic lines = new Logic();
        lines.getLongestWord("I like swimming");
        lines.getLongestWord("Hello");
        lines.getLongestWord("stop");
        String expected = "swimming";
//Act <- Vi utför nödvändiga beräkningar etc.
        String actual = lines.getLongestWord("stop");
//Assert <- Vi kollar att vi får korrekt utfall.


        Assertions.assertEquals(expected, actual);

    }
}
