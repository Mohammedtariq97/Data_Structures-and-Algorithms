package ds.linkedlist;

public class App1 {

	public static void main(String[] args) {
		singlyLinkedList myList = new singlyLinkedList();
		myList.insertFirst(100);
		myList.insertFirst(124);
		myList.insertFirst(135);		
		myList.insertFirst(300);
		myList.insertLast(200);
		
		myList.displayList();
		
		myList.deleteFirst();
		myList.displayList();
		
	}

}
