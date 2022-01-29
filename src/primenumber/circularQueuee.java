package primenumber;
//important question for exam
public class circularQueuee{
	
	int front;
	int rear;
	int queuee[];
	int size;
	
	 circularQueuee(int n){
		this.size=n;
		front=rear=-1;
		queuee= new int[n];
		
	}

	  public void enqueue(int data) {
		  if(isfull()) {
			  System.out.println("queue overflow");
		  }
		  else {
			  if(front==-1 && rear==-1) { //or is empty()
				  front=rear=0;
				  queuee[rear]=data;
			  }
			  else {
				  rear=(rear+1)%size;
				  queuee[rear]=data;
			  }
			  
		  }
		 
	 }
	  
	  public int dequeue() {
		int temp=front;
		if(isempty()) {
			System.out.println(" queue  underflow");
			return -999;
		}
		else {
			
			if(front==rear) {
				front=rear=-1;
			}
			else {
				front=(front+1)%size;
				
			}
			return queuee[temp];
		}
		
	  }
	 
	 public boolean isempty() {
		 return front==-1 && rear==-1; 
	 }
	 
	 public boolean isfull() {
		return(rear+1)%size==front;
			 
		 }
	 }

