import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }
}

class BinaryTree 
{
    Node root;
    StringBuilder sb=new StringBuilder();
    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value >= current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }

    public void add(int value) {
        if (root == null) {
            root = new Node(value);
            return;
        }
        root = addRecursive(root, value);
    }

    public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.value);

            traversePreOrder(node.left);

            traversePreOrder(node.right);
        }
    }

    public void getLeftTree(Node current) {
        if (current != null) {
            System.out.print(" " + current.value);
            sb.append(current.value);
            traversePreOrder(current.left);
        }
    }

    public void soln(Node current) {
        if (current == null) {
            return;
        } else {
            getLeftTree(current);
        }
        System.out.println(sb);
    }
}

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BinaryTree bt = new BinaryTree();
        // int totalNode = sc.nextInt();
        // if (totalNode > 0 && totalNode < 1000) {
        //     while (totalNode > 0) {
        //         bt.add(sc.nextInt());
        //         totalNode--;
        //     }
            bt.add(3);
            bt.add(1);
            bt.add(2);
            bt.add(1);
            bt.traversePreOrder(bt.root);
            System.out.println();
            bt.soln(bt.root);
        // }
        sc.close();
    }

}