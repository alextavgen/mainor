package mainor;

import java.util.Iterator;

public class LinkedListBag<Item> implements Iterable<Item>{
    private int amount;
    private Node first;

    private class Node {
        private Item item;
        private Node next;
    }

    public LinkedListBag(){
        first = null;
        amount = 0;
    }

    public boolean isEmpty(){
        return amount == 0;
    }

    public int size(){
        return amount;
    }

    public void add(Item item){
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        amount++;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ListIteratorBag();
    }

    private class ListIteratorBag implements Iterator<Item>{

        private Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
}
