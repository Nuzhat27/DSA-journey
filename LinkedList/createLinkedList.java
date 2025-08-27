package LinkedList;
//Creating a linkedlist
import java.util.*;
class Node{
	int val;
	Node next;
	Node(int val , Node next){
		this.val = val ;
		this.next = next ;
	}
}
class createLinkedList{
	public static void main(String args[]){
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr.add(5);arr.add(6);
		Node head = new Node(arr.get(0),null);
		Node current = head;
		for(int i = 1 ; i < arr.size() ; i ++){
			current.next = new Node(arr.get(i),null);
			current = current.next;
		}
		current.next = null;
		printLL(head);
	}
	public static void printLL(Node head){
		Node current = head ;
		while(current!=null){
			System.out.print(current.val + " ");
			current = current.next;
		}
    }
}
			


