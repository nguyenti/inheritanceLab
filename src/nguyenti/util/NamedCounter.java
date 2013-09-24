package nguyenti.util;

public class NamedCounter extends Counter {

    String name;

    /**
     * initialize NamedCounter using Counter and
     * setting name as the input, name
     * @param name
     * @param start
     */
    public NamedCounter(String name, int start) {
	super(start);
	this.name = name;
    } // NamedCounter(String, int)

    /**
     * Prints as friendly string with name
     * 
     */
    @Override
    public String toString() {
	return this.name + super.toString();
    } // toString()
}
