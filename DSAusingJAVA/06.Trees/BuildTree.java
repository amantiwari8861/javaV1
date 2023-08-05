import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node<T extends Comparable<T>> {
    T data;
    Node<T> leftNode;
    Node<T> rightNode;

    Node(T data) {
        this.data = data;
    }
}
class NormalTree<T extends Comparable<T>> {
    Scanner sc = new Scanner(System.in);
    public Node<T> root;

    @SuppressWarnings("unchecked")
    private Node<T> getNodeData() {
        Node newNode = null;
        System.out.print(" Enter node data:");
        String input = sc.nextLine();

        if (input.equals("")) {
            return null;
        }
        try {
            try {
                Byte b = Byte.valueOf(input);
                newNode = new Node<>(b);
            } catch (NumberFormatException e) {
            }

            if (newNode == null) {
                try {
                    Short s = Short.valueOf(input);
                    newNode = new Node<>(s);
                } catch (NumberFormatException e) {
                }
            }

            if (newNode == null) {
                try {
                    Integer i = Integer.valueOf(input);
                    newNode = new Node<>(i);
                } catch (NumberFormatException e) {
                }
            }
            if (newNode == null) {
                try {
                    Long l = Long.valueOf(input);
                    newNode = new Node<>(l);
                } catch (NumberFormatException e) {
                }
            }
            if (newNode == null) {
                try {
                    BigDecimal bd = new BigDecimal(input);
                    int precision = bd.precision() - 1;
                    // System.out.println("Precision :"+precision);
                    if (precision > 6 && precision <= 15) {
                        // System.out.println("it is double");
                        newNode = new Node<>(Double.valueOf(input));
                    } else if (precision >= 0 && precision <= 6) {
                        // System.out.println("it is float");
                        newNode = new Node<>(Float.valueOf(input));
                    } else {
                        // System.out.println("it is bigdecimal");
                        newNode = new Node<>(bd);
                    }
                } catch (NumberFormatException e) {
                }
            }
            if (newNode == null) {
                try {
                    Boolean b;
                    if (input.equalsIgnoreCase("true"))
                        b = true;
                    else if (input.equalsIgnoreCase("false"))
                        b = false;
                    else
                        b = null;
                    if (b != null)
                        newNode = new Node<>(b);
                } catch (NumberFormatException e) {
                }
            }

            if (newNode == null && input.length() == 1) {
                char ch = input.charAt(0);
                if (ch >= 32 && ch <= 47 || ch >= 58 && ch <= 64 || ch >= 91 && ch <= 96 || ch >= 123 && ch <= 127
                        || Character.isLetter(ch)) {
                    // System.out.println("Symbol or Special Character");
                    newNode = new Node<>(ch);
                }
            }

            if (newNode == null) {
                newNode = new Node<>(input);
            }
            // if(newNode !=null)
            // {
            // // Successfully parsed, print the data and its class.
            // System.out.println(newNode.data + ":" + newNode.data.getClass());
            // }
        } catch (Exception nf) {
            System.out.println("pls enter valid data ");
            nf.printStackTrace();
            getNodeData();
        }
        return newNode;
    }
    private Node<T> buildTree(Node<T> current) {
        current = getNodeData();
        if (current == null) {
            return null;
        }
        System.out.print("in leftNode of " + current.data);
        current.leftNode = buildTree(current.leftNode);
        System.out.print("in Right of " + current.data);
        current.rightNode = buildTree(current.rightNode);
        return current;
    }
    public void initializeTree() {
        this.root = buildTree(this.root);
    }
    // DFS -> Depth First Search
    public void traversePreOrder(Node<T> node) {
        // 6 4 3 5 8 7 9
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.leftNode);
            traversePreOrder(node.rightNode);
        }
    }
    public void traverseInOrder(Node<T> node) {
        // 3 4 5 6 7 8 9
        if (node != null) {
            traverseInOrder(node.leftNode);
            System.out.print(" " + node.data);
            traverseInOrder(node.rightNode);
        }
    }
    public void traversePostOrder(Node<T> node) {
        // 3 5 4 7 9 8 6
        if (node != null) {
            traversePostOrder(node.leftNode);
            traversePostOrder(node.rightNode);
            System.out.print(" " + node.data);
        }
    }
    // BFS -> Breadth First Search
    public void traverseLevelOrder() {
        if (root == null) {
            return;
        }

        Queue<Node<T>> nodes = new LinkedList<>();
        nodes.add(root);

        while (!nodes.isEmpty()) {

            Node<T> node = nodes.remove();

            System.out.print(" " + node.data);

            if (node.leftNode != null) {
                nodes.add(node.leftNode);
            }

            if (node.rightNode != null) {
                nodes.add(node.rightNode);
            }
        }
    }
    public void printTreeData() {
        // System.out.println("1.PreOrder");
        // System.out.println("2.InOrder");
        // System.out.println("3.PostOrder");

        System.out.print("\nPreOrder:");
        traversePreOrder(root);
        System.out.print("\nInOrder:");
        traverseInOrder(root);
        System.out.print("\nPostOrder:");
        traversePostOrder(root);
        System.out.print("\nLevel Order Traversal:");
        traverseLevelOrder();
    }
    private T findSmallestValue(Node<T> node) 
    {
        return node.leftNode == null ? node.data : findSmallestValue(node.leftNode);
    }
    private Node<T> deleteRecursive(Node<T> current, T value) {
        if (current == null) {
            return null;
        }
        if(value.compareTo(current.data)<0)
        {
            //Going to left of the tree
            current.leftNode = deleteRecursive(current.leftNode, value);
            return current;
        }
        else if(value.compareTo(current.data)>0)
        {
            //Going to Right of the tree
            current.rightNode = deleteRecursive(current.rightNode, value);
            return current;
        }
        else
        {
            // no child or leaf node
            if (current.leftNode == null && current.rightNode == null){
                return null;
            }
            // one child
            if (current.rightNode == null){
                return current.leftNode;
            }
            if (current.leftNode == null){
                return current.rightNode;
            }
            // both child (then find smallest)
            T smallestValue = findSmallestValue(current.rightNode);
            current.data = smallestValue;
            current.rightNode = deleteRecursive(current.rightNode, smallestValue);
            return current;
        }
    }
    public void delete(T value) {
        root = deleteRecursive(root, value);
    }
}
public class BuildTree {
    public static void main(String[] args) {
        NormalTree<Character> tree = new NormalTree<>();
        tree.initializeTree();
        tree.printTreeData();
        System.out.print("\n\nAfter Deletion");
        tree.delete('B');
        tree.printTreeData();
    }
}