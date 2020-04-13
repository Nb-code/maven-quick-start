package clinic.programming.training;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
<<<<<<< HEAD

import static org.junit.Assert.assertTrue;
=======
import static org.junit.Assert.*;
>>>>>>> dfb6cb8eff4f8bdf85f8bde71038d66ecb6c2d6a

public class ApplicationTest {
    private Application app;
    
    @Before
    public void setup() {
        app = new Application();
    }
    
    
    @Test
    public void testWordCountString() {
        int count = app.countWords("this is a test");
        assertTrue(count == 4);
    }

    @Test
    public void testWordCountEmpty() {
        int count = app.countWords("");
        assertTrue(count == 0);
    }

    @Test
    public void testWordCountNull() {
        int count = app.countWords(null);
        assertTrue(count == 0);
    }

    @Test
    @Ignore
    public void testWordCountMore() {
        int count = app.countWords("this will be skipped");
        assertTrue(count == 3);
    }

    @Test
    public void testWordCountSingle() {
        int count = app.countWords("test");
        assertTrue(count == 1);
    }
}