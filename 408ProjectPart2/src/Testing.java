
public class Testing {
	public static void main(String[] args)
	{
		LinkedList testLinkedList = new LinkedList();
		//1st part of the project
		testLinkedList.addToTail(35.2);
		testLinkedList.print();
		testLinkedList.addToTail(100.3);
		testLinkedList.print();
		testLinkedList.addToTail(5.6);
		testLinkedList.print();
		testLinkedList.addToTail(24.0);
		testLinkedList.print();
		testLinkedList.addToTail(-6.6);
		testLinkedList.print();
		testLinkedList.addToTail(-1.40);
		testLinkedList.print();
		testLinkedList.addToTail(70.4);
		testLinkedList.print();
		testLinkedList.addToTail(8.4);
		testLinkedList.print();
		testLinkedList.addToTail(18.8);
		testLinkedList.print();
		testLinkedList.addToTail(-92.0);
		testLinkedList.print();
		
		//2nd part of the project, remove the head node
		testLinkedList.removeHead();
		testLinkedList.print();
		
		
		//3rd part: remove the tail node
		testLinkedList.removeTail();
		testLinkedList.print();
		
		
		//4th part: insert a node of value 19.5 to the list in the position after the head node
		testLinkedList.insertAnyPosition(19.5, 1);
		testLinkedList.print();

		//5th part: insert a node of value 13.6 to the tail of the list
		testLinkedList.insertAnyPosition(13.60, testLinkedList.size);
		testLinkedList.print();
		test2ByHuyLe();
		 
		 
	}
	
	public static void test2ByHuyLe(){
		LinkedList secondTestLinkedList = new LinkedList();
		//insert 15 node by myself.
		secondTestLinkedList.addToTail(22.3);
		secondTestLinkedList.addToTail(35.4);
		secondTestLinkedList.addToTail(70.0);
		secondTestLinkedList.addToTail(22.3);
		secondTestLinkedList.addToTail(40.6);
		secondTestLinkedList.addToTail(80.4);
		secondTestLinkedList.addToTail(70.5);
		secondTestLinkedList.addToTail(20.2);
		secondTestLinkedList.addToTail(100.29);
		secondTestLinkedList.addToTail(99.1);
		secondTestLinkedList.addToTail(1.0);
		secondTestLinkedList.addToTail(2.3);
		secondTestLinkedList.addToTail(11.25);
		secondTestLinkedList.addToTail(11.26);
		secondTestLinkedList.addToTail(92.3);
		secondTestLinkedList.print();
		
		//remove head
		secondTestLinkedList.removeHead();
		secondTestLinkedList.print();
		
		//remove tail
		secondTestLinkedList.removeTail();
		secondTestLinkedList.print();
		
		//addToHead
		secondTestLinkedList.addToHead(13.1);
		secondTestLinkedList.print();
		
		//addToTail
		secondTestLinkedList.addToTail(15.05);
		secondTestLinkedList.print();
		
		//remove at position 4
		secondTestLinkedList.removeAnyPosition(4);
		secondTestLinkedList.print();
	}
}
