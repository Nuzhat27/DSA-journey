package LinkedList.SingleLL;
class singleLLTraversal{
	public List<Integer> traverseLL(ListNode head){
		ListNode current = head ;
		List<Integer> ans = new ArrayList<>();
		while(current != null){
			ans.add(current.val);
			current = current.next;
		}
		return ans;
	}
}
