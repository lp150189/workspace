
public class ArrayLinkedList {
	Node[] linkedList;
	int head;
	int tail;
	int size;
	
	public ArrayLinkedList()
	{
		linkedList = new Node[100];
		this.head = 0;
		this.tail = 0; 
		this.size = 0;
	}
	
	public boolean addToHead(double value)
	{
		/**
		 * base case when the size of the array is zero
		 */
		if(size ==0)
		{
			linkedList[0] = new Node(value, 0);
			head = 0;
			tail = 0;
			size = 1;
		}
		else
		{
			for (int i = 0; i< 100; i++)
			{
				if(linkedList[i] == null)
				{
					linkedList[i] = new Node(value, head);
					head = i;
					size++;
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean addToTail(double value)
	{
		/**
		 * base case when the size of the array is zero
		 */
		if(size == 0)
		{
			linkedList[0] = new Node(value, 0 );
			head = 0; 
			tail = 0;
			size = 1;
			
		}
		else
		{
			for(int i = 0 ; i< 100; i++)
			{
				if(linkedList[i] == null)
				{
					linkedList[i] = new Node(value, -1000);
					linkedList[recursiveFindIndexByPosition(size)].nextIndex = i;
					tail = i;
					
					size++;
					return true;
				}
				
			}
		}
		return false;
	}
	
	public boolean  removeHead()
	{
		if(size == 0 )
		{
			return false;
		}
		else if(size ==1)
		{
			linkedList[head] = null;
			size--;
			return true;
		}
		else
		{
			int temp = head;
			head = linkedList[head].nextIndex;
			linkedList[temp] = null;
			size--;
			return true;
		}

	}
	
	public boolean removeTail()
	{
		if(size == 0)
		{
			return false;
		}
		else if (size == 1)
		{
			linkedList[tail] = null;
			size--;
			return true;
		}
		else
		{
			int temp = tail;
			tail = recursiveFindIndexByPosition(size-1);
			linkedList[temp] = null;
			size--;
			return true;
		}
		
	}
	
	/**
	*	this method remove 
	*
	*/
	public boolean removeAny( int position)
	{
		int prev = position--;
		int index = recursiveFindIndexByPosition(prev);
		int temp = linkedList[index].nextIndex;
		int newNextIndex = linkedList[linkedList[index].nextIndex].nextIndex;
		linkedList[index].nextIndex = newNextIndex;
		linkedList[temp] = null;
		size--;
		return true;

	}
	
	public boolean insertAfter(double value, int position)
	{
		int index = recursiveFindIndexByPosition(position);

		if(position == size)
		{
			addToTail(value);
			return true;
		}
		//find open position
		for(int i = 0; i < 100; i++)
		{
			if(linkedList[i] == null)
			{
				linkedList[i] = new Node(value, linkedList[index].nextIndex);
				linkedList[index].nextIndex = i;
				size++;
				return true;
			}
		}
		return false;
	}
	
	public void print()
	{
		int index = head;
		if(size ==1 )
		{
			System.out.print(linkedList[index].value+ "  ");
			System.out.println();
			return;
		}
		while(linkedList[index].nextIndex != tail)
		{
			System.out.print(linkedList[index].value+ "  ");
			index = linkedList[index].nextIndex;
		}
		System.out.print(linkedList[index].value+ "  ");
		index = linkedList[index].nextIndex;
		System.out.print(linkedList[index].value+ "  ");
		System.out.println();
		System.out.println(head);
		System.out.println(tail);
	}


	private int recursiveFindIndexByPosition(int position)
	{
		int index = head;
		for(int i = 1; i< position; i++)
		{
			index = linkedList[index].nextIndex;
		}
		return index;
	}


}

class Node{
	double value;
	int nextIndex;
	
	public Node(double value, int nextIndex)
	{
		this.value = value;
		this.nextIndex = nextIndex;
	}
}