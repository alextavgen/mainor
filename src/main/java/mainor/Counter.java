package mainor;

public class Counter implements Comparable<Counter> {

    private final String name;     // counter name
    private int count;             // current value

    /**
     * Initializes a new counter starting at 0, with the given id.
     *
     * @param id the name of the counter
     */
    public Counter(String id) {
        name = id;
    }

    /**
     * Increments the counter by 1.
     */
    public void increment() {
        count++;
    }

    /**
     * Returns the current count.
     */
    public int tally() {
        return count;
    }

    /**
     * Returns a string representation of this counter
     */
    @Override
    public String toString() {
        return count + " " + name;
    }

    /**
     * Compares this counter to that counter.
     */
    public int compareTo(Counter that) {
        if (this.count < that.count) return -1;
        else if (this.count > that.count) return +1;
        else return 0;
    }
}