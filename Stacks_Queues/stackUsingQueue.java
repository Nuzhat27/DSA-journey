package Linkedlist;
//Implement stack using queue
class stackUsingQueue{
	Queue<Integer> q;
	public stackUsingQueue(){
		q = new LinkedList<>();
	}
	public void push(int x){
		int size = q.size();
		q.add(x);
		for(int i = 1 ; i <= size ; i ++){
			q.add(q.poll());
		}
	}
	public int poll(){
		int n = q.peek();
		q.poll();
		return n;
	}
	public int top(){
		return q.peek();
	}
	public boolean isEmpty(){
		return q.isEmpty();
	}
}
