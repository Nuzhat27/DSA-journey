package LinkedList;
//Concert array to linkedlist
class Node{
	int val;
	Node next;
	Node(int val , Node next){
		this.val = val ;
		this.next = next ;
	}
}
class arrayToLL{
	public static void main(String args[]){
	int[] arr = {1,2,3,4,5};
		Node head = new Node(arr[0] , null);
		Node current = head;
		for(int i = 1 ; i < arr.length ; i ++){
			current.next = new Node(arr[i] , null);
			current = current.next;
		}
		current.next = null;
		printLL(head);
		}
	public static void printLL(Node head){
		Node current = head;
		while(current!=null){
			System.out.print(current.val + " ");
			current = current.next;
		}
	}
}
