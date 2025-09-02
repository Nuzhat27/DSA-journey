package LinkedList;
/*Flattening of LL
Given a special linked list containing n head nodes where every node in the linked list contains two pointers:
‘Next’ points to the next node in the list
‘Child’ pointer to a linked list where the current node is the head
Each of these child linked lists is in sorted order and connected by a 'child' pointer.
Flatten this linked list such that all nodes appear in a single sorted layer connected by the 'child' 
pointer and return the head of the modified list. */
class flatteningLL{
	public ListNode flattenLL(ListNode head){
		/* Brute force
		ListNode temp = head;
		ListNode t2 ;
		ArrayList<Integer> arr = new ArrayList<>();
		while(temp != null){
			t2 = temp;
			while(t2 != null){
				arr.add(temp.val);
				t2 = t2.child;
			}
			temp = temp.next;
		}
		Collections.sort(arr);
		ListNode head = convertArrayToLL(arr);
		return head;
	}
	private ListNode convertArrayToLL(ArrayList arr){
		ListNode dummyNode = new ListNode(-1);
		ListNode temp = dummyNode;
		for(int i = 0 ; i < arr.size() ; i ++){
			temp.child = new ListNode((int)arr.get(i));
			temp = temp.child;
		}
		return dummyNode.child;
		*/
		//Optimal approach
		if(head != null || head.next != null){
			return head;
		}
		ListNode mergeHead = flattenLL(head.next);
		head = merge(head , mergeHead);
		return head;
	}
	ListNode merge(ListNode list1 , ListNode list2 ){
		ListNode dummyNode = new ListNode(-1);
		ListNode temp = dummyNode;
		while(list1 != null || list2 != null){
			if(list1.val < list2.val){
				temp.child = list1;
				temp = list1;
				list1 = list1.child;
			}
			else{
				temp.child = list2;
				temp = list2;
				list2 = list2.list2;
			}
			temp.next = null;
		}
		if(list1 != null)temp.child = list1;
		else temp.child = head2;
		
		return dummyNode.child;
	}
}