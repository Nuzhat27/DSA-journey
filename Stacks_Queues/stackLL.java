package Stacks_Queue;
//Implement stack using linkedlist
class stackLL{
	Node top;
	int curSize;
	stackLL(){
		top = null;
		curSize = 0;
	}
	public void push(int x){
		Node temp = new Node(x);
		temp.next = top;
		top = temp;
		curSize ++;
	}
	public int pop(){
		if(top == null){
			System.out.println("Stack is empty");
			return -1;
		}
		Node temp = top;
		top = top.next;
		temp.next = null;
		curSize --;
		return temp.val;
	}
	public int peek(){
		if(top == null){
			System.out.println("Stack is empty");
			return -1;
		}
		return top.val;
	}
	public boolean isEmpty(){
		return (curSize == 0);
	}
}