package mainor;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ResizingArrayBag<Item> implements Iterable<Item> {
    private Item[] a;         // array of items
    private int N = 0;        // number of elements on stack

    /**
     * Initializes an empty bag.
     */
    public ResizingArrayBag() {
        a = (Item[]) new Object[2];
    }

    /**
     * Is this bag empty?
     *
     * @return true if this bag is empty; false otherwise
     */
    public boolean isEmpty() {
        return N == 0;
    }

    /**
     * Returns the number of items in this bag.
     *
     * @return the number of items in this bag
     */
    public int size() {
        return N;
    }

    // resize the underlying array holding the elements
    private void resize(int capacity) {
        assert capacity >= N;
        Item[] temp = (Item[]) new Object[capacity];
        for (int i = 0; i < N; i++)
            temp[i] = a[i];
        a = temp;
    }

    /**
     * Adds the item to this bag.
     *
     * @param item the item to add to this bag
     */
    public void add(Item item) {
        if (N == a.length) resize(2 * a.length);    // double size of array if necessary
        a[N++] = item;                            // add item
    }


    /**
     * Returns an iterator that iterates over the items in the bag in arbitrary order.
     *
     * @return an iterator that iterates over the items in the bag in arbitrary order
     */
    public Iterator<Item> iterator() {
        return new ArrayIterator();
    }

    // an iterator, doesn't implement remove() since it's optional
    private class ArrayIterator implements Iterator<Item> {
        private int i = 0;

        public boolean hasNext() {
            return i < N;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            return a[i++];
        }
    }
}