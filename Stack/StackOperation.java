package practise;

public class StackOperation {
	private int size;
	private int top;
	private int[] stack;
	
	//constructor to set the size of stack and top
	StackOperation(int size){
		this.size=size;
		top=-1;
		stack=new int[size];
	}//constructor end
	
	//check if stack has no element in it
	boolean isEmpty() {
		return (top<=0);
	}
	
	//check if stack is full or not
	boolean isFull() {
		return (top==size);
	}
	
	//print stack elements using for each loop
	void printStack(int[] stack) {
		System.out.print("Stack elements : ");
		for(int i: stack)
			System.out.print(i+" ");
	}//printStack() end
	
	//store input in the stack if it's not full
	void push(int a) {
		 if(isFull()) {
			 System.out.println("Stack is full");
		 	System.exit(0);
		 }
		 else {
			 stack[++top]=a;
			 System.out.println("\nPushed : "+a);
			 printStack(stack);
		 }//else end		 
	}//push() end
	
	//remove top element from the stack if it's not empty
	void pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			System.exit(0);
		}
		else {			
			System.out.println("\nPopped : "+stack[top]);
			stack[top--]=0;
			printStack(stack);
		}//else end
	}//pop() end
}//StackOperatio class end
