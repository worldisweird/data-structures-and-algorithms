package java401_code_challenges.tree;

import java.util.ArrayList;

public class BinaryTree {

    ArrayList arrayOfPreOrder = new ArrayList();
    ArrayList arrayOfInOrder = new ArrayList();
    ArrayList arrayOfPostOrder = new ArrayList();

    public Node root;

    public BinaryTree(){
       root = null;

    }

    public ArrayList preOrder(Node current){
        if(current == null){
            System.out.println("Cannot traverse through a tree with nothing in it.");
            return arrayOfPreOrder;
        }

        arrayOfPreOrder.add(current.value);

        preOrder(current.leftChild);

        preOrder(current.rightChild);

        return arrayOfPreOrder;
    }


    public ArrayList preOrder(){
        preOrder(root);
        return arrayOfPreOrder;
    }

    public ArrayList postOrder(Node current){
        if(current == null){
            System.out.println("Cannot traverse through a tree with nothing in it.");
            return arrayOfPostOrder;
        }

        postOrder(current.leftChild);

        postOrder(current.rightChild);

        arrayOfPostOrder.add(current.value);


        return arrayOfPostOrder;
    }


    public ArrayList postOrder(){
        postOrder(root);
        return arrayOfPostOrder;
    }

    public ArrayList inOrder(Node current){
        if(current == null){
            System.out.println("Cannot traverse through a tree with nothing in it.");
            return arrayOfInOrder;
        }

        inOrder(current.leftChild);

        arrayOfInOrder.add(current.value);

        inOrder(current.rightChild);

        return arrayOfInOrder;
    }

    public ArrayList inOrder(){
        inOrder(root);
        return arrayOfInOrder;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.leftChild = new Node(2);
        tree.root.rightChild = new Node(3);
        tree.root.leftChild.leftChild = new Node(4);
        tree.root.leftChild.rightChild = new Node(5);
        ArrayList  outputRecieved= tree.inOrder();
        System.out.println(outputRecieved);
    }
}






//Reference: https://www.geeksforgeeks.org/dfs-traversal-of-a-tree-using-recursion/