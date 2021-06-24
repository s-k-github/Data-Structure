package queueArray;
import java.util.Scanner;
public class QueueMain {

	public static void main(String[] args) {
		System.out.println("Enter size of the queue : ");
		
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		QueueOperation q=new QueueOperation(size);
		System.out.println("Enter "+size+" queue elements : ");
		System.out.print("\nInsertion->");
		for(int i=0;i<size;i++)
			q.enQueue(sc.nextInt());
		
		System.out.println("\n\nDeletion->");
		System.out.println("How many elements do you wish to delete ? ");
		size=sc.nextInt();
		sc.close();
		for(int i=0;i<size;i++)
			q.deQueue();
	}
}

//OUTPUT:
//		Enter size of the queue : 
//		5
//		Enter 5 queue elements : 
//		
//		Insertion->5 4 3 2 1
//		
//		Inserted 5
//		Queue elements:5 
//		Inserted 4
//		Queue elements:5 4 
//		Inserted 3
//		Queue elements:5 4 3 
//		Inserted 2
//		Queue elements:5 4 3 2 
//		Inserted 1
//		Queue elements:5 4 3 2 1 
//		
//		Deletion->
//		How many elements do you wish to delete ? 
//		3
//		
//		Deleted 5
//		Queue elements:4 3 2 1 
//		Deleted 4
//		Queue elements:3 2 1 
//		Deleted 3
//		Queue elements:2 1 
	