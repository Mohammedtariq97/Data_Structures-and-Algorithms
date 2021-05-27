
public class Intersection {
	public SinglyListNode getIntersectionNode(SinglyListNode headA, SinglyListNode headB) {

		while (headA != null) {
			SinglyListNode cur2 = headB;
			while (cur2 != null) {
				if (headA == cur2) {
					return headA;
				}
				cur2 = cur2.next;
			}
			headA = headA.next;
		}
		return null;
	}
}
