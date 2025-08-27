package LinkedList;
//Deleting the head of single linkedlist
import java.util.*;
class deleteHead{
	public Node deleteHead(Node head){
		head = head.next;
		return head;
	}
}