package Graph;

public class queueee {
	int front;
	int rear;
	int queue[];
	int size;
	
	queueee(int n){
		this.front=-1;
		this.rear=-1;
		this.size=n;
		queue=new int[n];
	}
	
	public void enqueue(int data) {
		if(isfull()) {
			System.out.println(" queue overflow");
		}
		else {
			if(isempty()) {
				front++; //data in 0 Index
			}
			queue[++rear]=data; //last data after 0
			
		}
	}
	public int dequeue() {
		if(isempty()) {
			System.out.println("queue underflow");
			return -990;
		}
		else {
			int element=queue[front];
			if(front>=rear) {
				front=-1;
				rear=-1;
			}
			else {
				front++;
			}
			return element;
		}
	}
	
	public boolean isfull() {
		return rear==size-1;
		
	}

	public boolean isempty() {
		return front==-1;
	}
	
}
