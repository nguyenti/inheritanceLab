package nguyenti.util;

public class Counter {

    int count, start;

    /**
     * Initialize count and start to val
     * 
     * @param val
     */

    public Counter(int val) {
	count = val;
	start = val;
    }

    /**
     * add one to count
     */
    public void increment() throws Exception {
	this.count++;
    }

    /**
     * reset count to start
     */
    public void reset() {
	this.count = this.start;
    }

    /**
     * convert count to string
     */
    public String toString() {
	return "[" + this.count + "]";
    }

    /**
     * return the value of count
     * 
     * @return
     */
    public int value() {
	return this.count;
    }

}
