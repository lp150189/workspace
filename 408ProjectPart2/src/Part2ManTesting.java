import java.awt.Menu;
import java.util.Scanner;

public class Part2ManTesting {
	public static void main(String[] args)
	{
		LinkedList testing = new LinkedList();
		loadMenu();
		while(true){
			System.out.println("Enter your option");
			Scanner sc = new Scanner(System.in);
			int key = sc.nextInt();
			
			if(key == 1)
			{
				System.out.println("Enter the value you want to add");
				double value = sc.nextDouble();
				testing.addToHead(value);
				testing.print();
			}
			else if(key == 2){
				System.out.println("Enter the value you want to add");
				double value = sc.nextDouble();
				testing.addToTail(value);
				testing.print();
			}
			else if (key == 3)
			{
				testing.removeHead();
				testing.print();
			}
			else if(key == 4)
			{
				testing.removeTail();
				testing.print();
			}
			else if(key == 5)
			{
				System.out.println("Enter the value you want to add");
				double value = sc.nextDouble();
				System.out.println("Enter the position you want to add");
				int position = sc.nextInt();
				testing.insertAnyPosition(value, position);		
				testing.print();
			}
			else if (key == 6)
			{
				System.out.println("Enter the position you want to remove");
				int position = sc.nextInt();
				testing.removeAnyPosition(position);
				testing.print();
			}
		}
	}
	
	public static void loadMenu()
	{
		System.out.println("Welcome to the Linked List program");
		System.out.println("Enter the following number corresponding to the option");
		System.out.println("1) Add to head ");
		System.out.println("2) Add to tail ");
		System.out.println("3) Remove head ");
		System.out.println("4) Remove tail ");
		System.out.println("5) Insert at any position");
		System.out.println("6) Remove at any position");
		
	}
}
