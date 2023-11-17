package sem;

import org.junit.Test;
import static org.junit.Assert.*;

	public class AppTest {

	    @Test
	    public void testSum() {
	        assertEquals(10, App.sum(6, 4));
	        assertEquals(0, App.sum(0, 0));
	        assertEquals(0, App.sum(-6, 6));
	    }

	    @Test
	    public void testDivide() {
	        assertEquals(1.33, App.divide(4, 3), 0.01);
	        assertEquals(0, App.divide(0, 1), 0.01);
	        assertTrue(Double.isNaN(App.divide(1, 0)));
	    }

	    @Test
	    public void testReturnTwoChars() {
	        assertEquals("qw", App.returnTwoChars("qwerty"));
	        assertEquals("VA", App.returnTwoChars("VA"));
	        assertEquals("V", App.returnTwoChars("V"));
	        assertEquals("", App.returnTwoChars(""));
	        assertNull(App.returnTwoChars(null));
	    }

	    @Test
	    public void testDiv() {
	        assertEquals(1.33, App.div(new Double(4), new Double(3)), 0.01);
	        assertEquals(33, App.div(new Double(99), new Double(3)), 0.01);
	        assertNull(App.div(null, new Double(3)));
	        assertNull(App.div(new Double(3), null));
	        assertNull(App.div(new Double(3), new Double(0)));
	    }
	}