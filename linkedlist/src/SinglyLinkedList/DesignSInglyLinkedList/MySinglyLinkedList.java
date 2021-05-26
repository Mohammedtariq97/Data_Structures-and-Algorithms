
public class MySinglyLinkedList {
	public SinglyListNode head;
	
	MySinglyLinkedList(){
		head = null;
	}
	
	//getting node at specific index
	private SinglyListNode getNode(int index) {
		SinglyListNode cur = head;
		
		for(int i=0; i< index && cur!= null; i++) {
			cur = cur.next;
		}
		return cur;
	}
	
	//getting tail node
	private SinglyListNode getTailNode() {
		SinglyListNode cur = head;
		while(cur!= null && cur.next!= null) {
			cur = cur.next;
		}
		return cur;
	}
	
	//getting value of specific node
	public int getValue(int index) {
		SinglyListNode cur = getNode(index);
		if(cur == null) {
			return -1;
		}else {
			return cur.val;
		}
	}
	
	//Add node at head
	public void addAtHead(int val) {
		SinglyListNode cur = new SinglyListNode(val);
		cur.next = head;
		head = cur;
	}
	
	//Add node at tail
	public void addAtTail(int val) {
		if(head == null) {
			addAtHead(val);
			return;
		}
		SinglyListNode prev = getTailNode();
		SinglyListNode cur = new SinglyListNode(val);
		prev.next = cur;
		
	}
	
	//Add node at index
	public void addAtIndex(int index,int val) {
		if(index == 0) {
			addAtHead(val);
			return;
		}
		SinglyListNode prev = getNode(index-1);
		if(prev == null){
			return;
		}
		SinglyListNode cur = new SinglyListNode(val);
		cur.next = prev.next;
		prev.next = cur;
	}
	
	//Delete node at index
	public void deleteAtIndex(int index) {
		SinglyListNode cur = getNode(index);
		if(cur == null) {
			return;
		}
		SinglyListNode prev = getNode(index-1);
		if(prev == null){
			prev.next = cur.next;
		}else {
			head = cur.next;
		}
		
	}
}
