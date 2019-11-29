package algo;

import junit.framework.TestCase;
import org.junit.Test;

public class StringTrainingTest extends TestCase {

    @Test
    public void testTrue() throws Exception {
        assertEquals(true, true);
    }

    // Tests for censor()

    @Test
    public void testReverse() throws Exception {
        assertEquals("elpmaS", StringTraining.reverseWord("Sample"));
        assertEquals("SOcat", StringTraining.reverseWord("tacOS"));
    }

    @Test
    public void testEmptyString() throws Exception {
        assertEquals("", StringTraining.censor("", "DirtyWord"));
    }

    @Test
    public void testEmptyWord() throws Exception {
        assertEquals("Sentence", StringTraining.censor("Sentence", ""));
    }


    @Test
    public void testNotModified() throws Exception {
        assertEquals("Sentence", StringTraining.censor("Sentence", "DirtyWord"));
    }

    @Test
    public void testModified() throws Exception {
        assertEquals("S*******", StringTraining.censor("Sentence", "Sentence"));
    }

    @Test
    public void testMultipleModified() throws Exception {
        assertEquals("W*** and W***", StringTraining.censor("Word and Word", "Word"));
    }
}
