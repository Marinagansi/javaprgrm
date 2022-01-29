package linlklisttt;

public class linkedtext {
	public static void main(String[] args) {
	LinkListt bb=new LinkListt();
	bb.insert(40);
	bb.insert(6);
	bb.insert(5);
	bb.insert(5);
	bb.insert(60);
	bb.insert(7);
	bb.printing();
	System.out.println("aading infront of linklist");
	bb.infront(1);
	bb.printing();
	}
	
}
