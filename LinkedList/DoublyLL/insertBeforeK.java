package LinkedList.DoublyLL;
//Insert before kth node of DLL
class insertBeforeK{
	public ListNode insert(ListNode head , int K , int X){
		ListNode newNode = new ListNode(X);
		ListNode temp = head;
		if(head == null){
			if(K == 1){
				return newNode;
			}
			else return null;
		}
		if(K == 1){
			newNode.next = head;
			head.prev = newNode;
			return newNode;
		}
		for(int i = 1 ; i < K-1 ; i ++){
			if(temp != null){
				temp = temp.next;
			}
		}
		
		if(temp == null)return head;
		
		ListNode back = temp.prev;
		
		back.next = newNode;
		newNode.prev = back;
		
		newNode.next = temp;
		temp.prev = newNode;
		
		return head;
	}
}