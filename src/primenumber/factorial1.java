package primenumber;

public class factorial1 {

		int fact(int n) {
			if (n==1){
				return 1;
				
						
			}
			
			return n*fact(n-1); // using recursion 
			//recursion means calling function it self
			
		}
	


public static void main(String [] args) {
	factorial1 a=new factorial1();
	System.out.println(a.fact(1));
	
}
}

