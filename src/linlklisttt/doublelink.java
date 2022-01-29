package linlklisttt;

public class doublelink {
	public static class Node{
		Node prev;
		Node next;
		int data;
		
		Node(int data){
			this.prev=null;
			this.next=null;
			this.data=data;
		}
	}
	
	Node head=null;
			Node tail=null;
	public void addNode(int data) {
		Node newnode=new Node(data);
		if(head==null)
		{
			head=tail=newnode;
		}
		else {
			tail.next=newnode;
			newnode.prev=tail;
			tail=newnode;
		}
	}
	
	public void printlist() {
		Node current=head;
		while(current!=null) {
			System.out.println(current.data);
			current=current.next;
		}
	}
	public void infront(int data) {
		Node new_node=new Node(data);
		new_node.next=head;
		head=new_node;
		
	}
}
