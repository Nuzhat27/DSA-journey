package StacksandQueue;
//Implement stack using array
class stackArray{
	int top , size;
	private int[] stack;
	stackArray(int size){
		top = -1;
		this.size = size;
	}
	stackArray(){
		this(1000);
	}
	public void push(int x){
		if(top >= size -1){
			System.out.println("Stack is full. Stack overflow");
		}
		stackArray[++top] = x;
	}
	public int pop(){
		if(top == -1){
			System.out.println("Stack is empty.");
			return -1;
		}
		return stackArray[top--];
	}
	public int top(){
		if(top == -1){
			System.out.println("Stack is empty.");
			return -1;
		}
		return stackArray[top];
	}
	public boolean isEmpty(){
		if(top == -1)return true;
		return false;
	}
}