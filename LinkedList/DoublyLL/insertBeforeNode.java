package LinkedList.DoublyLL;
//Insert before a given node
class insertBeforeValX{
	public void insert(ListNode node , int X){
		ListNode newNode = new ListNode(X);
		ListNode back = node.prev;
		
		back.next = newNode;
		newNode.prev = back;
		
		newNode.next = node;
		node.prev = newNode;
	}
}