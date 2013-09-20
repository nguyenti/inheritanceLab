package nguyenti.util;

import java.io.PrintWriter;

public class CounterExpt {

    public static void main(String[] args) {
        // Set up output
        PrintWriter pen = new PrintWriter(System.out, true);

        // Set up some counters
        Counter alpha = new Counter(0);
        Counter beta = new Counter(123);
        Counter gamma = new Counter(-5);

        // Print original values
        pen.println("Original alpha = " + alpha);
        pen.println("Original beta = " + beta);
        pen.println("Original gamma = " + gamma);

        // Print incremented values
        alpha.increment();
        beta.increment();
        gamma.increment();
        pen.println("Updated alpha = " + alpha);
        pen.println("Updated beta = " + beta);
        pen.println("Updated gamma = " + gamma);

        // And we're done
        pen.close();
    } // main(String[])
}
