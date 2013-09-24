package nguyenti.util;

public class DoubleCounter extends Counter {
    
    public DoubleCounter(int start) {
        super(start);
    } // DoubleCounter(int)
    
    @Override
    public void increment() { 
        super.increment();
        super.increment();
    } // increment()
    
}
