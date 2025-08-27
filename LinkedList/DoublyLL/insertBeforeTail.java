package LinkedList.DoublyLL;
//Insert at tail of DLL
class insertBeforeTail{
	public ListNode insert(ListNode head , int X){
		ListNode newNode = new ListNode(X , null , null);
		if(head == null) return newNode;
		ListNode temp = head;
		while(temp.next != null){
			temp = temp.next;
		}
		ListNode back = twmp.prev;
		if(back == null){
			newNode.next = temp;
			temp.prev = newNode;
		}
		back.next = newNode;
		newNode.prev = back;
		newNode.next = temp;
		temp.prev = newNode;
		return head;
	}
}