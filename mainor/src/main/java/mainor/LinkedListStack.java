package mainor;

public class LinkedListStack<Item> {
    private int amount;
    private Node first;

    private class Node {
        private Item item;
        private Node next;
    }

    public LinkedListStack(){
        amount = 0;
        first = null;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public int size(){
        return amount;
    }

    public void push(Item item){
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        amount++;
    }

    public Item pop(){
        if (isEmpty()) throw new RuntimeException("Stack is empty");
        Item result = first.item;
        first = first.next;
        amount--;
        return result;
    }

    public Item peek(){
        if (isEmpty()) throw new RuntimeException("Stack is empty");
        return first.item;
    }
}
