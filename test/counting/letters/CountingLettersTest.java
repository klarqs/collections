package counting.letters;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;
class CountingLettersTest {

    private Logger logger = Logger.getLogger(CountingLetters.class.getName());

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void count() throws CountingLettersException {
        String sentence = "HELLO WORLD";
        try {
            Map<String, Integer> counts = CountingLetters.countLetters(sentence);
            assertNotNull(counts);
            assertTrue(counts.containsKey("H"));
            Set<String> keys = counts.keySet();
            assertEquals(8, keys.size());
            assertEquals(1, counts.get("H"));
            assertEquals(1, counts.get("E"));
            assertEquals(3, counts.get("L"));
            assertEquals(2, counts.get("O"));
            assertEquals(1, counts.get(" "));
            assertEquals(1, counts.get("W"));
            assertEquals(1, counts.get("R"));
            assertEquals(1, counts.get("D"));
            System.out.println(counts);
            logger.info(counts.toString());

        } catch (CountingLettersException ex) {
            ex.printStackTrace();
        }
    }
}