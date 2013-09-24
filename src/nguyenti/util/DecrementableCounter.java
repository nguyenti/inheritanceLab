package nguyenti.util;

public class DecrementableCounter extends Counter {

    public DecrementableCounter(int start) {
	super(start);
    } // DecrementableCounter(int)

    public void decrement() {
	this.count--;
    }

} // class DecrementableCounter
