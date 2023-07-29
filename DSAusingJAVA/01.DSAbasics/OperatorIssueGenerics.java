
class Node<T>
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

public class OperatorIssueGenerics 
{
    public static void main(String[] args) 
    {
        Node<Integer> n1=new Node<>(50);
        Node<Integer> n2=new Node<>(5);

        System.out.println(n1.value< n2.value);
        System.out.println(n1.value> n2.value);
    }
}
