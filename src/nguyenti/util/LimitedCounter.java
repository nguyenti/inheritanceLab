package nguyenti.util;

public class LimitedCounter extends Counter {

    int limit;

    /**
     * initialize LimitedCounter
     * @param start int.
     * this is the starting number
     * @param upper int.
     * this is the upper limit
     */
    public LimitedCounter(int start, int upper) {
	super(start);
	this.limit = upper;
	// TODO Auto-generated constructor stub
    }

    /**
     * adds one and checks if count exceeds upper
     * @pre pre1 
     * <p>pre2</p>
     * @post post1
     * post2
     */
    @Override
    public void increment() throws Exception {
	this.count++;
	if (this.count > this.limit) {
	    throw new Exception("count exceeds upper limit!");
	}
    }

}
