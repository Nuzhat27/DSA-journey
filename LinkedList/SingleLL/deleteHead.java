package LinkedList;
//Deleting the head of single linkedlist
import java.util.*;
class deleteHead{
	public ListNode deleteHead(ListNode head){
		head = head.next;
		return head;
	}
}