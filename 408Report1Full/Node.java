
public class Node {
	Node nextNode;
	double value;
	
	public Node(Node nextNode, double value){
		this.value = value;
		this.nextNode = nextNode;
	}
	
	public Node()
	{
		nextNode = null;
	}
}
