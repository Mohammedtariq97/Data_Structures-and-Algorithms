
public class MiddleNode {
	 public ListNode middleNode(ListNode head) {
	        ListNode cur = head;
	        int count =0;
	        while(cur != null){
	            count++;
	            cur = cur.next;
	        }
	        int mid = count/2;
	        int i=0;
	        ListNode cur1 = head;
	        while(i < mid){
	            cur1 = cur1.next;
	            i++;
	        }
	        return cur1;
	    }
	 
	 //Two pointer approach
	 public ListNode middleNode(ListNode head) {
	        ListNode slow = head, fast = head;
	        while (fast != null && fast.next != null) {
	            slow = slow.next;
	            fast = fast.next.next;
	        }
	        return slow;
	    }
}
