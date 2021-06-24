package practise;

import java.util.Scanner;

public class StackMain {

	public static void main(String[] args) {
		int size;
		
		System.out.println("Enter stack size: ");
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		
		StackOperation s=new StackOperation(size);
		
		System.out.println("Enter "+size+" stack elements : ");
		for(int i=0;i<size;i++)
			s.push(sc.nextInt());
		
		System.out.println("\n\nHow many elements do you wish to pop? : ");
		size=sc.nextInt();
		
		sc.close();
		
		for(int i=0;i<size;i++)
			s.pop();
	}//main() end
}//StackMain class end

//OUTPUT:
//	Enter stack size: 
//	5
//	Enter 5 stack elements : 
//	50 40 30 20 10
//	
//	Pushed : 50
//	Stack elements : 50 0 0 0 0 
//	Pushed : 40
//	Stack elements : 50 40 0 0 0 
//	Pushed : 30
//	Stack elements : 50 40 30 0 0 
//	Pushed : 20
//	Stack elements : 50 40 30 20 0 
//	Pushed : 10
//	Stack elements : 50 40 30 20 10 
//	
//	How many elements do you wish to pop? : 
//	2
//	
//	Popped : 10
//	Stack elements : 50 40 30 20 0 
//	Popped : 20
//	Stack elements : 50 40 30 0 0 
