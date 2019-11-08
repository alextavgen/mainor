package mainor;

import java.util.Iterator;

public class ResizingArrayBag<Item> implements Iterable<Item> {
    private Item[] storage;
    private int amount = 0;

    public ResizingArrayBag(){
        storage = (Item[])new Object[2];
    }

    public boolean isEmpty(){
        return amount == 0;
    }

    public int size(){
        return amount;
    }

    public void add(Item item){
        if (amount == storage.length){
            resize (2 * storage.length);
        }
        storage[amount] = item;
        amount = amount + 1;
    }

    private void resize(int capacity){
        assert capacity >= amount;
        Item[] temp = (Item[]) new Object[capacity];
        for (int i=0; i<amount; i++){
            temp[i] = storage[i];
        }
        storage = temp;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ArrayIterator();
    }

    private class ArrayIterator implements Iterator<Item>{

        private int counter = 0;

        @Override
        public boolean hasNext() {
            return counter < amount;
        }

        @Override
        public Item next() {
            return storage[counter++];
        }
    }
}
