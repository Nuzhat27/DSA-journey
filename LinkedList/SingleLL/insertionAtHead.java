package LinkedList.SingleLL;
//Insertion at head of single linkedlist
class insertAtHead{
	public ListNode insert(ListNode head , int X){
		ListNode newHead = new ListNode(X , head);
		return newHead;
	}
}