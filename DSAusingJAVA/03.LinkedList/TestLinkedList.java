class MyLinkedList
{
    Node start;
    Node tail;

    boolean addLast(String data)
    {
        Node newNode=new Node(data);
        if (start==null) 
        {
            start=newNode;
            tail=newNode;
            return true;
        }
        else
        {
            tail.setNext(newNode);
            tail=tail.getNext();
        }
        return false;
    }
    void printMyLL()
    {
        System.out.println("-------------------- All Nodes List -------------------");
        Node current=start;
        while (current != null) 
        {
            System.out.print(" | ");
            System.out.print(current.getData());
            System.out.print(" | ->");
            current=current.getNext();
        }
        System.out.println(" NULL");
    }
    boolean addFirst(String data)
    {
        Node newNode=new Node(data);
        if (start==null) 
        {
            start=newNode;
            return true;
        }
        else
        {
            newNode.setNext(start);
            start=newNode;
            return true;
        }
    } 
    int getLength()
    {
        int len=0;
        Node current=start;
        while (current != null) 
        {
            len++;
            current=current.getNext();
        }
        return len;
    }
    void add(int pos,String data)
    {
        int length=getLength();
        if (pos>length+1) 
        {
            System.out.println("Unable to add element at position "+pos+" bcz LL length is "+length);
        }
        else if(pos<1)
        {
            System.out.println("invalid position");
        }
        else if(pos==1)
        {
            addFirst(data);
        }
        else if(pos==length+1)
        {
            addLast(data);
        }
        else 
        {
            Node currNode=start;
            Node newNode=new Node(data);
            Node previous=null;
            for (int i=1;currNode != null;i++) 
            {
                if(i==pos-1)
                {
                    previous=currNode;
                }
                if(pos==i)
                {
                    newNode.setNext(previous.getNext());
                    previous.setNext(newNode);
                    break;
                }
                currNode=currNode.getNext();
            }
        }
    }
}
public class TestLinkedList 
{
    public static void main(String[] args) {
        
        MyLinkedList myLL=new MyLinkedList();
        myLL.addLast("Aman");
        myLL.addLast("Kashvi");
        myLL.addLast("Apurva");
        myLL.addLast("Dolly Sharma");
        myLL.addLast("Arun");
        // for (int i = 0; i < 100000; i++) 
        // {
        //     myLL.addLast("Aman "+i);
        // }
        // System.out.println(myLL.getLength());
        myLL.addFirst("amantiwari8861");
        myLL.printMyLL();
        
        // System.out.println("Adding at 1st Position");
        // myLL.add(1, "Mani sir");
        // myLL.printMyLL();
        // System.out.println("Adding at 7th position ");
        // myLL.add(7, "Abhishek");
        // myLL.printMyLL();
        // System.out.println("Adding at 3rd position");
        // myLL.add(3, "amantiwari8861 2.0");
        // myLL.printMyLL();
        // System.out.println("Adding at 10th position");
        // myLL.add(10, "amantiwari8861 3.0");
        // myLL.printMyLL();

        // myLL.add(0,"Hiii");
        // myLL.add(-5,"Hiii");
        myLL.add(myLL.getLength()+2,"Hiii");
        myLL.printMyLL();

    }
}