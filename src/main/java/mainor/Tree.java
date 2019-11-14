package mainor;

public class Tree {
    public int item;
    public Tree left;
    public Tree right;

    public Tree(int item){
        this.item = item;
    }

    public void setLeft(Tree left){
        this.left = left;
    }

    public void setRight(Tree right){
        this.right = right;
    }



    static int sum(Tree root){
        int sum = (Integer) root.item;

        if (root.left != null){
            sum = sum + sum(root.left);
        }
        if (root.right != null){
            sum = sum + sum(root.right);
        }

        return sum;
    }

    public Tree insert(Tree root, int value){
        if(root == null){
            return new Tree(value);
        }
        if (value < root.item){
            root.left = insert(root.left, value);
        } else if (value > root.item){
            root.right = insert(root.right, value);
        } else {
            // value exists
            return root;
        }
        return root;
    }
    public static void main(String[] args){

        //System.out.println(root);

        int [] array = {-3, -6, 4, 76, 41, 11, -43, -87, 100, 150};

        var root = new Tree(0);
        for (int i = 0; i<array.length; i++){
            root.insert(root, array[i]);
        }

        System.out.println();

    }
}