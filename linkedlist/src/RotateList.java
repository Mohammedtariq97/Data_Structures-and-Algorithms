
public class RotateList {
	public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;
        if(head.next == null) return head;
        int n=1;
        ListNode cur = head;
        while(cur.next != null){
            cur = cur.next;
            n++;
        }
        cur.next = head;
        
        ListNode tail = head;
        for(int i=0; i< n- k % n -1; i++ ){
            tail = tail.next;
        }
        ListNode newHead = tail.next;
        
        tail.next = null;
        return newHead;
    }
}
