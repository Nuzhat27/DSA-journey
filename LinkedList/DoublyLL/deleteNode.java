package LinkedList.DoublyLL;
//Delete the given node from DLL
class DeleteNode{
	public void delete(ListNode node){
		ListNode back = node.prev;
		ListNode front = node.next;
		node.prev = null;
		node.next = null;
		
		//If the given node is the only node in DLL
		if(front == null && back == null)return null;
		//If the given node is head
		else if(back == null){
			node.next = null;
			front.prev = null;
			return front;
		}
		//If the given node is tail
		else if(front == null){
			back.next = null;
			temp.prev = null;
		}
		else{
			back.next = front;
			front.prev = back;
		}
	}
}