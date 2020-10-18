package ds.linkedlist;

public class App3 {

	public static void main(String[] args) {
		DoublyLinkedList myList = new DoublyLinkedList();
		myList.insertFirst(20);
		myList.insertFirst(40);
		myList.insertFirst(60);
		myList.insertLast(80);
		myList.insertAfter(40, 100);
		myList.displayForward();
		myList.displayBackward();
		myList.deleteFirst();
		myList.deleteLast();
		myList.displayForward();
		myList.displayBackward();
	}
}
