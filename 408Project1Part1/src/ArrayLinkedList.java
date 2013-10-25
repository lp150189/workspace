
public class ArrayLinkedList {
	private Node[] linkedList;
	private int head;
	private int tail;
	private int size;
	
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
			for (int i = 0; i< size; i++)
			{
				if(linkedList[i] != null)
				{
					linkedList[i].value = value;
					linkedList[head].nextIndex = head;
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
			for(int i = 0 ; i< size; i++)
			{
				if(linkedList[i] != null)
				{
					linkedList[i].value = value;
					linkedList[tail].nextIndex = i;
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
			head = linkedList[head].nextIndex;
			linkedList[head] = null;
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
			tail = recursiveFindPreviousIndex(tail);
			linkedList[tail] = null;
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
		int newNextIndex = linkedList[linkedList[index].nextIndex].nextIndex;
		linkedList[index].nextIndex = newNextIndex;
		linkedList[linkedList[index].nextIndex] = null;
		size--;
		return true;

	}
	
	public boolean insertAfter(double value, int position)
	{
		int index = recursiveFindIndexByPosition(position);

		//find open position
		for(int i = 0; i < size; i++)
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
		while(linkedList[index].nextIndex != tail)
		{
			System.out.print(linkedList[index].value+ "   ");
			index = linkedList[index].nextIndex;
		}
		System.out.print(linkedList[tail].value);
	}

	private int recursiveFindPreviousIndex(int index)
	{
		int i = head;
		while(linkedList[i].nextIndex != tail)
		{
			if(linkedList[i].nextIndex == index)
			{
				return i; 
			}
			i = linkedList[i].nextIndex;
		}
		return -10000;
	}

	private int recursiveFindIndexByValue(double value)
	{
		
		int i = head;
		while(linkedList[i].nextIndex != tail)
		{
			if(linkedList[i].value == value)
			{
				return i;
			}
			i = linkedList[i].nextIndex;
		}
		if(linkedList[tail].value == value)
		{
			return tail;
		}
		return -10000;
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