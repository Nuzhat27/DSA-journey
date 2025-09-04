package Stacks_Queues;
//Implement queue using array
class queueArray{
	int curSize , size , start , end;
	int[] queue;
	public queueArray(int size){
		this.size = size;
		queue = new int[size];
		start = -1;
		end = -1;
		curSize = 0;
	}
	public queueArray(){
		this(1000);
	}
	public void push(x){
		if(curSize == size){
			System.out.println("Queue overflow");
		}
		if(curSize == 0){
			start = 0 ;
			end = 0;
		}
		else end = (end+1)%size;
		curSize += 1;
		queue[end] = x;
	}
	public int pop(){
		if(curSize == 0){
			System.out.println("Queue is empty");
			return -1;
		}
		int el = queue[start];
		if(curSize == 1){
			start = -1;
			end = -1;
		}
		start = (start+1)%size;
		curSize -= 1;
		return el;
	}
	public int peek(){
		if(curSize == 0){
			System.out.println("Queue is empty");
		}
		else return queue[start];
	}
	public boolean isEmpty(){
		return (curSize == 0);
	}
}