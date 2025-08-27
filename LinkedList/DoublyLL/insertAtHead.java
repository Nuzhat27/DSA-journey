package LinkedList.DoublyLL;
//Insert at head of doubly linkedlist
class insertAtHead{
	public ListNode insert(ListNode head , int X){
		ListNode newNode = new ListNode(X , head , null);
		head.prev = newNode;
		return newNode;
	}
}
