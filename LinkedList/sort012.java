package LinkedList;
/*Sort a LL of 0's 1's and 2's
Given the head of a singly linked list consisting of only 0, 1 or 2.
Sort the given linked list and return the head of the modified list.
Do it in-place by changing the links between the nodes without creating new nodes.
*/
class sort012{
	public ListNode sort(ListNode head){
		/*Brute Force
		ListNode temp = head;
		int c0 = 0 , c1 = 0 , c2 = 0;
		while(temp != null){
			if(temp.val == 0)c0++;
			else if(temp.val == 1)c1++;
			
			temp = temp.next;
		}
		temp = head;
		while(temp != null){
			if(c0 > 0){
				temp.val = 0;
				c0--;
			}
			else if(c1 > 0){
				temp.val = 1;
				c1--;
			}
			else temp.val = 2;
			
			temp = temp.next;
		}
		return head;
		*/
		if(head == null || head.next == null)return head;
		//Declaration of dummy nodes
		ListNode zero = new ListNode(-1);
		ListNode one = new ListNode(-1);
		ListNode two = new ListNode(-1);
		
		//Storing the head positions
		ListNode zeroHead = zero;
		ListNode oneHead = one;
		ListNode twoHead = two;
		
		ListNode temp = head;
		
		while(temp != null){
			if(temp.val == 0){
				zero.next = temp;
				zero = zero.next;
			}
			else if(temp.val == 1){
				one.next = temp;
				one = one.next;
			}
			else{
				two.next = temp;
				two = two.next;
			}
			temp = temp.next;
		}
		zero.next = (oneHead.next != null)? oneHead.next : twoHeaad.next;
		one.next = twoHead.next;
		two.next = null;
		return zeroHead.next;
	}
}