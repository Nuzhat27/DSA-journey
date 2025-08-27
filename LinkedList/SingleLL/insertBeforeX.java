package LinkedList.SingleLL;
//Insert before val x in LL
class insertBeforeX{
	public ListNode insert(ListNode head , int X){
		ListNode temp = head;
		ListNode prev = null;
		ListNode newNode = new ListNode(X);
		if(head == null) return null;
		if(head.val == X){
			newNode.next = head;
			return newNode;
		}
		while(temp!=null){
			if(temp.val == X){
				prev.next = newNode;
				newNode.next = temp;
				break;
			}
			prev = temp;
			temp = temp.next;
		}
	}
}