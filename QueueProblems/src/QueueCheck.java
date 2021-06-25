
public class QueueCheck {

	public static void main(String[] args) {
		//Checking Normal queue
		MyQueue queue = new MyQueue();
		queue.enQueue(10);
		System.out.println(queue.Front());
		queue.enQueue(20);
		System.out.println(queue.Front());
		queue.deQueue();
		System.out.println(queue.Front());
		queue.deQueue();
		if(queue.isEmpty() == true) {
			System.out.println("Queue Empty");
		}
		
		//Checking Circular Queue
		MyCircularQueue queue1 = new MyCircularQueue(5);
		queue1.enQueue(10);
		queue1.enQueue(20);
		queue1.enQueue(30);
		queue1.enQueue(40);
		System.out.println(queue1.rear());
		queue1.deQueue();
		System.out.println(queue1.front());
		queue1.deQueue();
		if(queue1.isEmpty() == true) {
			System.out.println("Queue Empty");
		}
		queue1.enQueue(20);
		queue1.enQueue(30);
		queue1.enQueue(40);
		queue1.enQueue(50);
		System.out.println(queue1.front());
		System.out.println(queue1.rear());
		if(queue1.isFull() == true) {
			System.out.println("Queue Full");
		}
	}

}
