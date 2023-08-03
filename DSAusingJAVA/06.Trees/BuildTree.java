import java.math.BigDecimal;
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
    Node<T> root;

    @SuppressWarnings("unchecked")
    Node<T> getNodeData()
    {
        Node newNode = null;
        System.out.println("Enter node data:");
        String input = sc.nextLine();
        try {
            try {
                Byte b = Byte.valueOf(input);
                newNode = new Node<>(b);
            } catch (NumberFormatException e) {}

            if (newNode == null) {
                try {
                    Short s = Short.valueOf(input);
                    newNode = new Node<>(s);
                } catch (NumberFormatException e) {}
            }

            if (newNode == null) {
                try {
                    Integer i = Integer.valueOf(input);
                    newNode = new Node<>(i);
                } catch (NumberFormatException e) {}
            }
            if (newNode == null) {
                try {
                    Long l = Long.valueOf(input);
                    newNode = new Node<>(l);
                } catch (NumberFormatException e) {}
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
                } catch (NumberFormatException e) {}
            }
            if (newNode == null) {
                try {
                    Boolean b ;
                    if(input.equalsIgnoreCase("true"))
                        b=true;
                    else if(input.equalsIgnoreCase("false"))
                        b=false;
                    else
                        b=null;
                    if (b != null) 
                        newNode = new Node<>(b);
                } 
                catch (NumberFormatException e) {}
            }

            if (newNode == null && input.length() == 1) {
                char ch=input.charAt(0);
                if(ch>=32 && ch<=47 || ch>=58 && ch<=64 || ch>=91 && ch<=96||ch>=123 && ch<=127 || Character.isLetter(ch))
                {
                    // System.out.println("Symbol or Special Character");
                    newNode = new Node<>(ch);
                }
            }

            if (newNode == null) {
                newNode = new Node<>(input);
            } 
            if(newNode !=null) 
            {
                // Successfully parsed, print the data and its class.
                System.out.println(newNode.data + ":" + newNode.data.getClass());
            }
        } 
        catch (Exception nf) 
        {
            System.out.println("pls enter valid data ");
            nf.printStackTrace();
            getNodeData();
        }
        return newNode;
    }
    void buildTree() 
    {
        Node<T> newNode=getNodeData();
        System.out.println(newNode.data+":"+newNode.data.getClass());
    }
}

public class BuildTree {

    public static void main(String[] args) {

        NormalTree<Character> tree = new NormalTree<>();
        tree.buildTree();
    }
}