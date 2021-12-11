package primenumber;

public class stringchar {
	int top=-1;
	char stacks[];
	int size;
	stringchar(int n){
		this.size=n;
		stacks=new char[n];
	}
	void push(char data) {
		if(isfull()) {
			System.out.println("stackovelow");
		}
		else {
			//top++;
			
			stacks[++top]=data;
		}
		
	}
	char pop() {
		if(isempty()) {
			System.out.println("stackoverflow empty");
			return 'f';//to show stack is empty
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
	
	public char peek() {
		return stacks[top];
	}



}
