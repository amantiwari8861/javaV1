// class Node<T>
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
    void isLessThan(T val)
    {
        // System.out.println(value==val);
        // System.out.println(value!=val);
        // System.out.println(value<val); //error
        // System.out.println(value>val); //error
        // System.out.println(value>=val); //error
        // System.out.println(value<=val); //error
        // System.out.println(value.compareTo(Integer.valueOf("12")));//error
        System.out.println(value.compareTo(val));
        //returns a negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the specified object.
    }
}

public class OperatorIssueGenerics 
{
    public static void main(String[] args) 
    {
        // Node<Integer> n1=new Node<>(50);
        // Node<Integer> n2=new Node<>(5);

        // System.out.println(n1.value< n2.value);
        // System.out.println(n1.value> n2.value);
        // n1.isLessThan(12);
        // n1.isLessThan(50);
        // n1.isLessThan(80);

        // System.out.println(Integer.valueOf("50").compareTo(Integer.valueOf("12")));
        // System.out.println(Integer.valueOf("02").compareTo(Integer.valueOf("3")));
        // System.out.println(Integer.valueOf("50").compareTo(Integer.valueOf("120")));
        System.out.println(Character.valueOf('A').compareTo(Character.valueOf('B')));
        System.out.println(Character.valueOf('C').compareTo(Character.valueOf('B')));
        System.out.println(Character.valueOf('D').compareTo(Character.valueOf('D')));
    }
}