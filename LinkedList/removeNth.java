package LinkedList;
//Remove Nth node from the back of the LL
class removeNth{
	public ListNode removeNthNode(ListNode head , int N){
		ListNode fast = head;
		ListNode slow = head;
		for(int i = 1 ; i <= N ; i++ ){
			fast = fast.next;
		}
		//If fast becomes null then the nth node from the end is the head
		if(fast == null)return head.next;
		
		while(fast.next != null){
			slow = slow.next;
			fast = fast.next;
		}
		small.next = fast;
		return head;
	}
}