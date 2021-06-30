
public class LinkedListCycle2 {
	 public ListNode detectCycle(ListNode head) {
	        if(head == null){
	            return null;
	        }
	        ListNode slow = head;
	        ListNode fast = head.next;
	        while(slow!=fast){
	            if(fast == null || fast.next == null){
	                return null;
	            }
	            slow = slow.next;
	            fast = fast.next.next;
	        }
	        ListNode ptr1 = head;
	        ListNode ptr2 = slow;
	        while(ptr1!=ptr2){
	            ptr1 = ptr1.next;
	            ptr2 = ptr2.next;
	        }
	        return ptr1;
	    }
}
