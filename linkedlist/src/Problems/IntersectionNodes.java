
public class IntersectionNodes {
	//Run time: 294ms
	 public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	        ListNode curA = headA;
	        while(curA != null){
	            ListNode curB = headB;
	            while(curB != null){
	                if(curA == curB){
	                    return curA;
	                }
	                curB = curB.next;
	            }
	            curA = curA.next;
	        }
	        return null;
	    }
	 
	//Run time: 6ms (HashSet approach)
	 public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	        HashSet<ListNode> set = new HashSet<>();
	        while(headA!=null){
	            set.add(headA);
	            headA = headA.next;
	        }
	        
	        while(headB!=null){
	            if(set.contains(headB)){
	                return headB;
	            }
	            headB = headB.next;
	        }
	        return null;
	    }
}
