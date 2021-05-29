
public class RemovingElements {
	 public SinglyListNode removeElements(SinglyListNode head, int val) {
		 SinglyListNode dummy = new SinglyListNode(0);
	        dummy.next = head;
	        SinglyListNode prev = dummy;
	        SinglyListNode cur = head;
	        while(cur!=null){
	            if(cur.val == val){
	                prev.next = cur.next;
	            }else{
	                prev= cur;
	            }
	            cur = cur.next;
	        }
	        return dummy.next;
	    }
}
