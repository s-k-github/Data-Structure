package graph.graphArray;

import java.util.Scanner;

public class GraphMain {
//5 0 1 0 4 1 2 1 4 2 3 3 4 -1
	public static void main(String[] args) {
		int source,target;
		System.out.println("Please enter number of vertices : ");
		Scanner sc=new Scanner(System.in);
		int vertices=sc.nextInt();
		GraphOperations graph=new GraphOperations(vertices);
		System.out.print("Enter source and target to connect two vertices : ");
		System.out.print("\nsource target ->");
		source=sc.nextInt();
		target=sc.nextInt();
		try {
			do {
				graph.add(source,target);
				System.out.print("source target ->");
				source=sc.nextInt();
				target=sc.nextInt();
			}while(source!=-1 || target!=-1);
			
			graph.display();
			
			System.out.println("How many vertex you wish to delete ? ");
			int n=sc.nextInt();
			do {
				System.out.print("source target ->");
				source=sc.nextInt();
				target=sc.nextInt();
				graph.delete(source,target);
				n--;
			}while(n!=0);
			sc.close();
			graph.display();
		}
		catch(ArrayIndexOutOfBoundsException e) {
	         System.out.println("\nThe souce or destination you have provided is invalid");
			System.out.println("source and destination must be between 0 and "+(vertices-1));
		}
		
		
		
	}

}
