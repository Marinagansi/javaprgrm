package Graph;

public class LinkListt {
	public static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
		Node head=null;
		Node tail=null;
		
		public void insert(int data) {
			Node newnode=new Node(data);
			if(head==null) {
				head=tail=newnode;
			}
			else {
				tail.next=newnode;
						tail=newnode;
			}
		}
		 
		public void printing() {
			Node current=head;
			while(current!=null) {
				System.out.println(current.data);
				current=current.next;
			}
		}
		
		public void infront(int data) {
		
			Node newone=new Node(data);
			newone.next=head;
			head=newone;
		}
	

	

}
