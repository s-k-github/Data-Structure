package queueArray;

public class QueueOperation {

	private int front;
	private int rear;
	private int[] queueArray;
	private int size;
	
	QueueOperation(int size){
		this.size=size;
		queueArray=new int[size];
		front=rear=-1;
	}
	
	public void displayQueue(int[] queueArray) {
		System.out.print("Queue elements:");
		for(int i=front;i<=rear;i++)
			System.out.print(queueArray[i]+" ");
	}

	public void enQueue(int element) {
		if(isFull())
			System.out.println("Queue is full");
		else {
			front=0;
			queueArray[++rear]=element;
			System.out.println("\nInserted "+element);
			displayQueue(queueArray);		
		}		
	}
	
	public void deQueue() {
		if(isEmpty())
			System.out.println("Queue empty");
		else {
			System.out.println("\nDeleted "+queueArray[front++]);
			displayQueue(queueArray);
		}
	}
	
	private boolean isFull() {
		//return (rear==front);
		return (rear==size-1);
	}
	
	private boolean isEmpty() {
		return ((front<0) || (front>rear));
	}
	
}
