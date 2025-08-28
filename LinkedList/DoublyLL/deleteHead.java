package LinkedList.DoublyLL;
//Delete head of DLL
class deleteHead{
	public ListNode delete(ListNode head){
		if(head == null || head.next == null)return null;
		ListNode newHead = head.next;
		head.next = null;
		newHead.prev = null;
		return newHead;
	} 
}