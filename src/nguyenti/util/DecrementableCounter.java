package nguyenti.util;

public class DecrementableCounter extends Counter {

    /**
     * Initialized similarly to Counter
     * @param start
     */
    public DecrementableCounter(int start) {
	super(start);
    } // DecrementableCounter(int)

    /**
     * subtract one
     */
    public void decrement() {
	this.count--;
    }

} // class DecrementableCounter
