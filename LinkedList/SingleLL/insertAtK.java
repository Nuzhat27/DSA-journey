package LinkedList.SingleLL;
class insertAtK{
	public ListNode insert(ListNode head , int X , int k){
		ListNode temp = head;
		ListNode newNode = new ListNode(X);
		if(head == null) return newNode;
		if(k == 1){
			newNode.next = head;
			return newnode;
		}
		int count = 0;
		while(temp!=null){
			count++;
			if(count == k-1){
				newNode.next = newNode;
				temp.next = newNode;
				break;
			}
			
			temp = temp.next;
		}
		return head;
	}
}