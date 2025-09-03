package LinkedList;
//Remove duplicated from sorted DLL
class removeDuplicatesDLL{
	public ListNode removeDuplicates(ListNode head){
		ListNode temp = head;
		ListNode nextNode;
		while(temp != null){
			nextNode = temp.next;
			while(nextNode != null && nextNode.val == temp.val){
				ListNode duplicate = nextNode;
				nextNode = nextNode.next;
				duplicate = null;
			}
			temp.next = nextNode;
			if(nextNode != null){
				nextNode.prev = temp;
			}
			temp = temp.next;
		}
		return head;
	}
}