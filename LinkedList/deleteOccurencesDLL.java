package linkedlist;
/*Delete all occurrences of a key in DLL
Given the head of a doubly linked list and an integer target.
 Delete all nodes in the linked list with the value target and return the head of the modified linked list.
*/
class deleteOccurencesDLL{
	public ListNode deleteAllOccurrences(ListNode head, int target){
		ListNode temp = head;
		ListNode back;
		ListNode front;
		while(temp != null){
			if(temp.val == target){
				if(temp == head){
					head = head.next;
				}
				front = temp.next;
				back = temp.prev;
				if(back != null){
					back.next = front;
				}
				if(front != null){
					front.prev = back;
				}
				temp = front;
			}
			else{
				temp = temp.next;
			}
		}
		return head;
	}
}
