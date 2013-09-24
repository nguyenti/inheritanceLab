package nguyenti.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class CounterTest {

    @Test
    public void testCounter() {
	fail("Not yet implemented");
    }

    @Test
    public void testIncrement() {
	fail("Not yet implemented");
    }

    @Test
    public void testReset() {
	fail("Not yet implemented");
    }

    @Test
    public void testToString() {
	fail("Not yet implemented");
    }

    @Test
    public void testValue() throws Exception {
	Counter alpha = new NamedCounter("Jake", 0);
        Counter beta = new DoubleCounter(123);
	DecrementableCounter gamma = new DecrementableCounter(-5);
	assertEquals("original alpha", 0, alpha.value());
	assertEquals("original beta", 123, beta.value());
	assertEquals("original gamma", -5, gamma.value());
	for (int i = 0; i < 10; i++) {
	    alpha.increment();
	    beta.increment();
	    gamma.increment();
	} // for
	assertEquals("updated alpha", 10, alpha.value());
	assertEquals("updated beta", 133, beta.value());
	assertEquals("updated gamma", 5, gamma.value());
	alpha.reset();
	beta.reset();
	gamma.reset();
	assertEquals("reset alpha", 0, alpha.value());
	assertEquals("reset beta", 123, beta.value());
	assertEquals("reset gamma", -5, gamma.value());
	gamma.reset();
	assertEquals("reset gamma", -5, gamma.value());
	gamma.decrement();
	assertEquals("decremented gamma", -6, gamma.value());
    }

}
