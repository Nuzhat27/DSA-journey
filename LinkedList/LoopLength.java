package Linkedlist;
//Length of loop in LL
/*Definition of singly linked list:
class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}
 */

 class LoopLength {
     public int findLengthOfLoop(ListNode head) {
        /*Brute force
		ListNode temp = head;
        int timer = 0;
        HashMap<ListNode,Integer> list = new HashMap<>();

        while(temp != null){
            if(list.containsKey(temp)){
                int length = timer - list.get(temp);
                return length;
            }
            list.put(temp , timer);
            temp = temp.next;
            timer++;
        }
        return 0;
		*/
		ListNode temp = head;
		int length = 0;
		temp = head;
		ListNode slow = head;
		ListNode fast = head;
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast){
				length = findLength(slow , fast);
				return length;
				}
			}
		}
		return length;
     }
	 private int findLength(ListNode slow , ListNode fast){
		 int count = 1;
		 fast = fast.next;
		 while(slow != fast){
			 count++;
			 fast = fast.next;
		 }
		 return count;
	 }
 }