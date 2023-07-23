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
    Node root;
    private void addLeftNode()
    {
        
    }
    private void addRightNode()
    {
        
    }
    public void add(String data)
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
    

}



public class TreeDemo 
{
    public static void main(String[] args) 
    {
        BinaryTree bt=new BinaryTree();
        bt.add("A");
        bt.preOrder(bt.root);
    }
}
