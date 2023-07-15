import java.util.LinkedList;

class Node
{
    private Object data;
    private Node next;
    private Node previous;
    Node(){}
    Node(Object data)
    {
        this.data=data;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    public Node getPrevious() {
        return previous;
    }
    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}
class DoublyLinkedList
{
    Node head;
    Node tail;
    void addLast(Object data)
    {
        Node newNode=new Node(data);
        if (head==null) 
        {
            head=newNode;
            tail=newNode;
        }
        else
        {
            newNode.setPrevious(tail);
            tail.setNext(newNode);
            tail=tail.getNext();
        }
    }
    void printFromFirst()
    {
        Node currNode=head;
        while (currNode != null) 
        {
            System.out.print(" "+currNode.getData());   
            currNode=currNode.getNext(); 
        }
    }
    void printReverse()
    {
        Node currNode=tail;
        while (currNode != null) 
        {
            System.out.print(" "+currNode.getData());   
            currNode=currNode.getPrevious(); 
        }
    }
}
class TestDoubly
{
    public static void main(String args[])
    {
        DoublyLinkedList doublyLL=new DoublyLinkedList();
        doublyLL.addLast(10);
        doublyLL.addLast(20);
        doublyLL.addLast("Aman");
        doublyLL.addLast(40);

        doublyLL.printFromFirst();
        System.out.println("\nPrinting from reverse ");
        doublyLL.printReverse();


        LinkedList<String> ll=new LinkedList<>();
    }
}