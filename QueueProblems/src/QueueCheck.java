
public class QueueCheck {

	public static void main(String[] args) {
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
	}

}
