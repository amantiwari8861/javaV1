import java.util.LinkedList;
import java.util.Queue;

class Node<T extends Comparable<T>>
{
    T value;
    Node<T> left;
    Node<T> right;

    Node(T value) 
    {
        this.value = value;
        right = null;
        left = null;
    }
}

class BinaryTree<T extends Comparable<T>>
{
    Node<T> root;

    private Node<T> addRecursive(Node<T> current, T value) 
    {
        if (current == null) {
            return new Node<>(value);
        }
        // System.out.println(current.value+" : "+value+" "+value.compareTo(current.value));
        if (value.compareTo(current.value)<0) 
        {
            System.out.println("Added left node "+current.value+" : "+value);
            current.left = addRecursive(current.left, value);
        } 
        else if (value.compareTo(current.value)>0) 
        {
            System.out.println("Added Right node "+current.value+" : "+value);
            current.right = addRecursive(current.right, value);
        } 
        else 
        {
            // value already exists
            System.out.println("Added current node "+current.value+" : "+value);
            return current;
        }

        return current;
    }

    public void add(T value) 
    {
        root = addRecursive(root, value);
    }
    //DFS -> Depth First Search
    public void traversePreOrder(Node<T> node) 
    {
        //6 4 3 5 8 7 9
        if (node != null) 
        {
            System.out.print(" " + node.value);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
        else
        {
            if (node == null) 
            {
                System.out.println("\ngot null ");
            }
            return;
        }
    }
    public void traverseInOrder(Node<T> node) 
    {
        //3 4 5 6 7 8 9
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
    }
    public void traversePostOrder(Node<T> node) 
    {
        //3 5 4 7 9 8 6
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.value);
        }
    }
    //BFS -> Breadth First Search
    public void traverseLevelOrder()
    {
        if (root == null) {
            return;
        }

        Queue<Node<T>> nodes = new LinkedList<>();
        nodes.add(root);

        while (!nodes.isEmpty()) {

            Node<T> node = nodes.remove();

            System.out.print(" " + node.value);

            if (node.left != null) {
                nodes.add(node.left);
            }

            if (node.right != null) {
                nodes.add(node.right);
            }
        }
    }

    private boolean containsNodeRecursive(Node<T> current, T value) 
    {
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        }
        return value.compareTo(current.value)==-1
                ? containsNodeRecursive(current.left, value)
                : containsNodeRecursive(current.right, value);
    }

    public boolean containsNode(T value) {
        return containsNodeRecursive(root, value);
    }

    public void delete(T value) {
        root = deleteRecursive(root, value);
    }

    private Node<T> deleteRecursive(Node<T> current, T value) {
        if (current == null) {
            return null;
        }

        if (value == current.value) 
        {
            // no child or leaf node
            if (current.left == null && current.right == null) 
            {
                return null;
            }
            // one child
            if (current.right == null) 
            {
                return current.left;
            }
            if (current.left == null) 
            {
                return current.right;
            }
            // both child (then find smallest)
            T smallestValue = findSmallestValue(current.right);
            current.value = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
            return current;
        }
        if (value.compareTo(current.value)==1)
        {
            current.left = deleteRecursive(current.left, value);
            return current;
        }
        current.right = deleteRecursive(current.right, value);
        return current;
    }

    private T findSmallestValue(Node<T> root) 
    {
        return root.left == null ? root.value : findSmallestValue(root.left);
    }
}

public class BinaryTreeMain2
{
    public static void main(String[] args) {

        // BinaryTree<Integer> bt = new BinaryTree<>();
        // bt.add(6);
        // bt.add(4);
        // bt.add(8);
        // bt.add(3);
        // bt.add(5);
        // bt.add(7);
        // bt.add(9);
        // bt.traversePreOrder(bt.root);

        // BinaryTree<Character> bt2 = new BinaryTree<>();
        // bt2.add('A');
        // bt2.add('B');
        // bt2.add('C');
        // bt2.add('D');
        // bt2.add('E');
        // bt2.add('F');
        // bt2.add('G');
        // System.out.print("\nPreOrder :");
        // bt2.traversePreOrder(bt2.root);
        // System.out.print("\nInOrder :");
        // bt2.traverseInOrder(bt2.root);
        // System.out.print("\nPostOrder :");
        // bt2.traversePostOrder(bt2.root);
        
        BinaryTree<Character> bt3 = new BinaryTree<>();
        bt3.add('D');
        // bt3.add('D');
        // bt3.add('D');
        bt3.add('B');
        bt3.add('F');
        bt3.add('A');
        bt3.add('C');
        bt3.add('E');
        bt3.add('G');
        System.out.print("\nPreOrder :");
        bt3.traversePreOrder(bt3.root);
        System.out.print("\nInOrder :");
        bt3.traverseInOrder(bt3.root);
        System.out.print("\nPostOrder :");
        bt3.traversePostOrder(bt3.root);

    }
}