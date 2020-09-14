package ds.linkedlist;

public class App2 {

	public static void main(String[] args) {
		circularLinkedList myList = new circularLinkedList();
		myList.insertFirst(50);
		myList.insertFirst(100);
		myList.insertFirst(150);
		myList.insertFirst(200);
		myList.insertLast(500);
		
		myList.displayList();
	}

}
