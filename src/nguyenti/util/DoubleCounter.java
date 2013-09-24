package nguyenti.util;

public class DoubleCounter extends Counter {
    
    /**
     * initialize DoubleCounter (subclass of Counter)
     * similarly to Counter
     * @param start
     */
    public DoubleCounter(int start) {
        super(start);
    } // DoubleCounter(int)
    
    /**
     * increment overrides Counter's increment
     * and increments by 2
     * @throws Exception 
     */
    @Override
    public void increment() throws Exception { 
        super.increment();
        super.increment();
    } // increment()
    
}
