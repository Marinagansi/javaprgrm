package primenumber;

public class linklisttest {
	
	public static void main(String [] args){
		 LinkedListtt list=new LinkedListtt();
		   list.addNode(10); 
		   list.addNode(20); 
		   list.addNode(30); 
		   list.addNode(40); 
		   list.printlist();
		 System.out.println("data at position 3");
		 System.out.println(list.getDataAtPos(3)); 
		 list.removeDataAtPos(3);
		 System.out.println("after deleting node ");
		 list.printlist();
		 System.out.println("new data");
		
		list.insertfront(90);
		list.printlist();
		 
	}
	

}

