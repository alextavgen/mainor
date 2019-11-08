package mainor;

public class ResizingArrayStack<Item> {
    private Item[] storage;
    private int amount;

    public ResizingArrayStack(){
        storage = (Item[]) new Object[2];
    }

    public int size(){
        return amount;
    }

    private void resize(int capacity){
        assert capacity >= amount;
        Item[] temp = (Item[]) new Object[capacity];
        for (int i=0; i<amount; i++){
            temp[i] = storage[i];
        }
        storage = temp;
    }

    public void push(Item item){
        if (amount == storage.length){
            resize(2* storage.length);
        }
        storage[amount++] = item;
    }

    public boolean isEmpty(){
        return amount == 0;
    }

    public Item pop(){
        if (isEmpty()) throw new RuntimeException("Stack is empty");
        Item result = storage[amount -1];
        storage[amount -1] = null;
        amount--;
        return result;
    }

    public Item peek(){
        if (isEmpty()) throw new RuntimeException("Stack is empty");
        return storage[amount -1];
    }
}
