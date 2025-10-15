package Linkedlist;
//Implement queue using linkedlist
class Node{
	int val;
	Node next;
	Node(int val){
		next = null;
		this.val = val;
	}
}
class queueLL{
	int curSize;
	Node start , end;
	public queueLL(){
		start = null;
		end = null;
		curSize = 0;
	}
	public void push(int x){
		Node temp = new Node(x);
		if(curSize == 0 ){
			start = temp;
			end = temp;
		}
		else{
			end.next = temp;
			end = end.next;
		}
		curSize ++;
	}
	public int pop(){
		if(curSize == 0){
			System.out.println("Queue is empty.");
			return -1;
		}
		Node temp = start;
		if(curSize == 1){
			start = null;
			end = null;
			return temp.val;
		}
		else{
			start = start.next;
		}
		temp.next = null;
		curSize --;
		return temp.val;
	}
	public int peek(){
		if(curSize == 0){
			System.out.println("Queue is empty");
			return -1;
		}
		return start.val;
	}
	public boolean isEmpty(){
		return (curSize == 0);
	}
}