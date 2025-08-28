package LinkedList;
//Check if linkedlist is plaindrome or not
class isPalindrome{
	public boolean isLLPalindrome(ListNode head){
		if(head.next == null)return true;
		ListNode fast = head;
		ListNode slow = head;
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}
		ListNode last = reverseList(slow);
		ListNode temp2 = last;
		while(temp2 != null){
			if(temp.val != temp2.val){
				reverseList(last);
				return false;
			}
			temp = temp.next;
			temp2 = temp2.next;
		}
		reverseList(last);
		return true;
	}
	public ListNode reverseList(ListNode head){
		if(head == null || head.next == null)return head;
		ListNode temp = head;
		ListNode front;
		ListNode back = null;
		while(temp != null{
			front = temp.next;
			temp.next = back;
			back = temp;
			temp = front;
		}
		return back;
	}
}