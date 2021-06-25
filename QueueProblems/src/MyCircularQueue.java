
public class MyCircularQueue {
	
	private int head;
	private int tail;
	private int[] data;
	private int size;

	MyCircularQueue(int k){
		head = -1;
		tail = -1;
		data = new int[k];
		size = k;
	}
	
	public boolean enQueue(int val) {
		if(isFull() == true) {
			return false;
		}
		if(isEmpty() == true) {
			head =0;
		}
		tail = (tail +1) % size;
		data[tail] = val;
		return true;
	}
	
	public boolean deQueue() {
		if(isEmpty() == true) {
			return false;
		}
		if(head == tail) {
			head = -1;
			tail = -1;
			return true;
		}
		head = (head+1) % size;
		return true;
	}
	
	public int rear() {
		if(isEmpty() == true) {
			return -1;
		}
		return data[tail];
	}
	
	public int front() {
		if(isEmpty() == true) {
			return -1;
		}
		return data[head];
	}
	
	public boolean isFull() {
		if((tail +1) % size == head) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isEmpty() {
		if(head == -1) {
			return true;
		}else {
			return false;
		}
	}
}
