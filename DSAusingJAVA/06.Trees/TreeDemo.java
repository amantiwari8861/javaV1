class Node 
{
	private String data;
	private Node leftNode;
	private Node rightNode;

	public Node(String data)
	{
		this.data=data;
	}
	public void setData(String data){
		this.data = data;
	}
	public String getData(){
		return this.data;
	}
    public Node getLeftNode() {
        return leftNode;
    }
    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }
    public Node getRightNode() {
        return rightNode;
    }
    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }
}
class BinaryTree
{
    private Node root;
    BinaryTree()
    {
        root=null;
    }
    public Node addLeftNode(Node node,String data)
    {
        Node newNode=new Node(data);
        node.setLeftNode(newNode);
        return newNode;
    }
    public Node addRightNode(Node node,String data)
    {
        Node newNode=new Node(data);
        node.setRightNode(newNode);
        return newNode;
    }
    public void add(Node node,String data)
    {
        Node newNode=new Node(data);
        if(root==null)
        {
            root=newNode;
        }
        
    }
    public void preOrder(Node node)
    {
        if(node != null)
        {
            System.out.println(node.getData());
            preOrder(node.getLeftNode());
            preOrder(node.getRightNode());
        }
        else
        {
            return;
        }
    }
    public void inOrder()
    {
        
    }
    public void postOrder()
    {
        
    }
    
    public Node getRoot()
    {
        return root;
    }

}



public class TreeDemo 
{
    public static void main(String[] args) 
    {
        BinaryTree bt=new BinaryTree();
        Node root=bt.getRoot();
        bt.add(root,"A");
        bt.addLeftNode(root,"B");
        bt.addRightNode(root,"C");
    }
}
