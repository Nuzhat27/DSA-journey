package LinkedList;
/*Given two non-empty linked lists l1 and l2 which represent two non-negative integers.
The digits are stored in reverse order with each node storing one digit.
Add two numbers and return the sum as a linked list.
The sum Linked List will be in reverse order as well.
The Two given Linked Lists represent numbers without any leading zeros, except when the number is zero itself.*/

class addTwoNumber{
	public ListNode solution(ListNode l1 , ListNode l2){
		ListNode temp = new Listnode();
		ListNode dummyNode = temp;
		int sum = 0 , carry = 0 ;
		while(l1 != null || l2 != null){
			sum = carry;
			if(l1){
				sum += l1.val;
				l1 = l1.next;
			}
			if(l2){
				sum += l2.val;
				l2 = l2.next;
			}
			
			carry = sum / 10;
			temp.next = new ListNode(sum % 10);
			temp = temp.next;
		}
		if(carry != 0){
			temp.next = new ListNode(carry);
		}
		return dummyNode.next;
	}
}
