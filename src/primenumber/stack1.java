package primenumber;
/* to implement stack*/
public class stack1 {
	int top=-1;
	int stacks[];
	int size;
	stack1(int n){
		this.size=n;
		stacks=new int[n];
	}
	void pushoperation( int data) {
		if(isfull()) {
			System.out.println("stackovelow");
		}
		else {
			//top++;
			
			stacks[++top]=data;
		}
		
	}
	int pop() {
		if(isempty()) {
			System.out.println("stackunderflow");
			return -999;//to show stack is empty
		}
		else {
//			int temp=top;
//			top--;
			return stacks[top--];
			
		}
	}
	public boolean isfull() {
		if(top==size-1) {
			return true;
		}
	return false;
	}
	public boolean isempty() {
	if(top==-1) {
		return true;
	}
	return false;
	}
	
	
}
