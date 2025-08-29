package Linkedlist;
//LC 83. Remove Duplicates from Sorted List
class removeDuplicates{
	public ListNode remove(ListNode head){
		if(head == null || head.next == null)return head;
		ListNode current = head;
		while(current != null && current.next != null){
			if(current.val == current.next.val){
				//Skip the duplicate node
				current.next = current.next.next;
			}
			else{
				//If vals are not same move to the next node
				current = current.next;
			}
		}
		return head;
	}
}