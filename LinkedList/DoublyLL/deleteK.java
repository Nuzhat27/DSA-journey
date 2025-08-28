package LinkedList.DoublyLL;
//Delete kth element of DLL
class deleteK{
	public ListNode delete(ListNode head , int k){
		if(head == null)return null;
		ListNode temp = head;
		for(int i = 1 ; i < k ; i ++){
			temp = temp.next;
		}
		
		//If k is greater than the size of linkedlist
		if(temp == null)return head;
		
		ListNode front = temp.next;
		ListNode back = temp.prev;
		
		//If the kth element is the only node in the linkedlist
		else if(front == null && back == null)return null;
		
		//If head is the kth element 
		else if(back == null){
			head.next = null;
			front.prev = null;
			return front;
		}
		
		//If kth element is tail
		else if(front == null){
			back.next = null;
			temp.prev = null;
		}
		
		//If the kth element is not head or tail
		else{
			temp.prev = null;
			temp.next = null;
			back.next = front;
			front.prev = back;
		}
		return head;
	}
}