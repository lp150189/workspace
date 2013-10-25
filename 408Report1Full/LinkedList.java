
public class LinkedList {
	Node head;
	int size;
	public LinkedList()
	{
		head = new Node();
		size = 0;
	}
	
	
	public boolean addToHead(double value)
	{
		// if there is nothing in our linked list which is the size = 0
		if(size == 0 )
		{
			head = new Node(null, value);
			size++;
			return true;
		}else
		{	
			Node newHeadNode = new Node(head, value);
			head = newHeadNode;
			size++;
			return true;
		}
	}
	
	public boolean addToTail(double value)
	{
		//if there is nothing in our linkedlist which is the size ==0 
		if(size == 0)
		{
			head = new Node(null, value);
			size++;
			return true;
		}
		else {
			Node navigate = head;
			while(navigate.nextNode != null)
			{
				navigate = navigate.nextNode;
			}
			//right now the navigate node is pointing to the tail
			navigate.nextNode = new Node(null, value);
			size++;
			return true;
		}
		
	}
	
	public boolean removeHead()
	{
		//if there is nothing in our linked list which is the size == 0 
		if( size == 0)
		{
			return false;
		}
		else if( size ==1 )// if the size is one
		{
			head = null;
			size = 0 ;
			return true;
		}
		else// if the size of the linkedlist is greater than 1 
		{
			head = head.nextNode;
			size--;
			return true;
		}	
	}
	
	public boolean removeTail()
	{
		//if there is nothing in our linked list which is the size == 0 
		if( size == 0)
		{
			return false;
		}
		else if( size ==1 )// if the size is one
		{
			head = null;
			size = 0 ;
			return true;
		}
		else// if the size of the linkedlist is greater than 1 
		{
			Node navigate = head;
			for( int i = 0; i < size-2; i++)
			{
				navigate = navigate.nextNode;
			}
			navigate.nextNode = null;
			size--;
			return true;
		}
	}
	
	public boolean insertAnyPosition(double value, int position)
	{
		if(position > size || position < 1)
		{
			return false;
		}
		else
		{
			Node navigate = head;
			for(int i = 0; i< position-1; i++)
			{
				navigate = navigate.nextNode;
			}
			Node newNode = new Node(navigate.nextNode, value);
			navigate.nextNode = newNode;
			size++;
			return true;
		}
	}
	
	public boolean removeAnyPosition(int position)
	{
		if( position > size || position <1)
		{
			return false;
		}
		else 
		{
			Node navigate = head ; 
			for(int i = 0; i<position-2;i++ )
			{
				navigate = navigate.nextNode;
			}
			navigate.nextNode = navigate.nextNode.nextNode;
			size--;
			return true;
			
		}
	}


	public void print() {
		Node navigate;
		navigate = head;
		while(navigate.nextNode != null)
		{
			System.out.print(navigate.value + ",  ");
			navigate = navigate.nextNode;
		}
		System.out.print(navigate.value + ",  ");
		System.out.println();
	}
}
