
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
	 
	 
	 //Brute force
	 public SinglyListNode removeElementsNew(SinglyListNode head, int val) {
		 SinglyListNode dummy = new SinglyListNode(0);
	        dummy.next = head;
	        SinglyListNode prev = head;
	        SinglyListNode current = head;
	        prev = dummy;
	        
	        while(current != null){
	            if(current.val == val && current == head){
	                prev.next = current.next;
	                current = current.next;
	            }else if(current.val == val){
	                prev.next = current.next;
	                current = current.next;
	            }else{
	                current = current.next;
	                prev = prev.next;
	            }
	        }
	        
	        return dummy.next;
	    }
}
