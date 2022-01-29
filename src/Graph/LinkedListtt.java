package Graph;
/*important question*/
public class LinkedListtt {
	int size=0;
	public static class Node{
		int data;
		Node next; // address of node
	
		Node(int data){
			this.data=data; //indicate class instance(memory block)
			this.next=null;
		}
	}
	
	Node head=null;
	Node tail=null;
	public void addNode(int data) {
		size++;
		Node newnode=new Node(data); //address of node
		if (head==null) {
			head=newnode;
			tail=head;
		}
		else {
			tail.next=newnode;
			tail=newnode;
			
//			Node current=head;
//			
//			while(current.next!=null) {
//				current=current.next;
//			}
//			current.next=newnode;

		}
	}
	public void printlist() {
		Node current=head;
		
		while(current!=null) {
		System.out.println(current.data);
		
		current=current.next; //this will move to next node 
		}
		
	}
	public int getsize() {
		return size;
	}
	public int getDataAtPos(int i) {
		if(i<=size) {
			 Node current=head; //j==0
			 for(int j=1;j<i;j++) {
				 current=current.next;

			 }
			 return  current.data;	 
		}

		return  -999;
	}
	
	
	public void removeDataAtPos(int i) {
		Node current=head;
		for (int j=1;j<i-1;j++) {
			current=current.next;
		}
		current.next=current.next.next;
        size--;
	}
	 
	public void insertfront(int data) {
		Node Newnode=new Node(data);
		Newnode.next=head;
		head=Newnode;
	
	
	}


}