package LinkedList.DoublyLL;
//Array to Doubly LL
class arrayToDLL{
	public ListNode DLL(int[] arr){
		ListNode head = new ListNode(arr[0]);
		ListNode temp;
		ListNode prev = head;
		for(int i = 1 ; i < arr.length ; i ++){
			temp = new ListNode(arr[i] , null , prev);
			prev.next = temp;
			prev = temp;
		}
		return head;
	}
}