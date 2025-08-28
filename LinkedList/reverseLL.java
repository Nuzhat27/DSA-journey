package LinkedList;
//Reverse a LL
class reverseLL{
	public ListNode reverse(ListNode head){
		if(head == null && head.next == null)return head;
		/*Iterative approach
		ListNode temp = head;
		ListNode front;
		ListNode back;
		while(temp != null){
			front = temp.next;
			temp.next = back;
			back = temp;
			temp = front;
		}
		return back;
		*/
		//Recursive approach
		ListNode newHead = reverse(head.next);
		front = head.next;
		front.next = head;
		head.next = null;
		return newHead;
		
	}
}