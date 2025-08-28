package LinkedList;
/*Segregate odd and even nodes in LL
Given the head of a singly linked list.
 Group all the nodes with odd indices followed by all the nodes
 with even indices and return the reordered list.
Consider the 1st node to have index 1 and so on. 
The relative order of the elements inside the odd and even group
 must remain the same as the given input.
*/

class oddevenNode{
	public ListNode segregate(ListNode head){
		if(head == null || head.next == null)return head;
		ListNode even = head.next;
		ListNode evenHead = head.next;
		ListNode odd = head;
		while(even != null || even.next != null){
			odd.next = odd.next.next;
			odd = odd.next;
			
			even.next = even.next.next;
			even = even.next;
			
		}
		odd.next = evenHead;
		return head;
	}
}