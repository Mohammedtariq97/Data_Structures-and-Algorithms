package ds.stack;

public class queue {

	private int maxSize;
	private long[] queArray;
	private int front;
	private int rear;
	private int nitems;
	public queue(int size) {
		
		this.maxSize = size;
		this.queArray = new long[size];
		this.front = 0;
		this.rear = -1;
		this.nitems = 0;
	}
	public void insert(long j) {
		if (rear == maxSize-1) {
			rear = -1;
		}
		rear++;
		queArray[rear] = j;
		nitems++;
	}
	
	public void remove() {
		long temp = queArray[front];
		front++;
		if (front == maxSize) {
			front =0;
		}
		nitems--;
	}
	
	public long peekfront() {
		
		return queArray[front];
	}
	
	public boolean isEmpty() {
		return (nitems == 0);	
	}
	
	public boolean isFull() {
		return (nitems == maxSize);	
	}
	
	public void view() {
		
		for(int i=0; i< queArray.length; i++) {
			System.out.print(queArray[i] + " ");
		}
	}
	
}
