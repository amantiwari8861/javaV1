public class Node 
{
	private String data;
	private Node next;//by default null

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
	public void setNext(Node node){
		this.next = node;
	}
	public Node getNext(){
		return this.next;
	}
}
