
public class ReverseLinkedList {
	 public SinglyListNode reverseList(SinglyListNode head) {
		 SinglyListNode prev = null;
		 SinglyListNode curr = head;
	        while (curr != null) {
	        	SinglyListNode nextTemp = curr.next;
	            curr.next = prev;
	            prev = curr;
	            curr = nextTemp;
	        }
	        return prev;
	    }
}
