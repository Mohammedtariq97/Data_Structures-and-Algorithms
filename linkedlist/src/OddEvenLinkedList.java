
public class OddEvenLinkedList {
	public SinglyListNode oddEvenList(SinglyListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        SinglyListNode slow = head;
        SinglyListNode fastHead = head.next;
        SinglyListNode fast = head.next;
        while(fast!= null && fast.next!= null){
            slow.next = fast.next;
            slow = slow.next;
            fast.next = slow.next;
            fast = fast.next;
        }
        slow.next = fastHead;
        return head;
    }
}
