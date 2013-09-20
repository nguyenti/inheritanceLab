package nguyenti.util;

public class Counter {

    int count, start;

    public Counter(int val) {
	count = val;
	start = val;
    }

    public void increment() {
	this.count++;
    }

    public void reset() {
	this.count = this.start;
    }

    public String toString() {
	return "[" + this.count + "]";
    }
    
    public int value() {
	return this.count;
    }
    
    
    

}
