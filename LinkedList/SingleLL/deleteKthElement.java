package LinkedList.SingleLL;
class deleteKthElement{
	public ListNode deleteKth(ListNode head){
		ListNode current = head;
		ListNode prev = null;
		if(head == null) return head;
		if(k==1){
			//Delete the head 
			current = current.next;
			return current;
		}
		int count =0;
		while(current != null){
			count++;
			if(count == k){
				prev.next = prev.next.next;
				break;
			}
			prev = current;
			current= current.next;
		}
		return head;
	}
}