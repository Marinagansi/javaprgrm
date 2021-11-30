package primenumber;

public class prime {
	
	
	public static boolean isprime (int n) { //   for (int i = 2; i <= Math.sqrt(n); i++)
	
		int i;
		
		for (i=2;i<n;i++) {
//		for (i=2;i<n/2;i++) {
//		for (i=2;i<Math.sqrt(n);i++) { 
			if (n%i==0) {
				return false;
			}
		   
			
		}
		return true;  
	}



public static void main(String[] args) {
	prime a=new prime();
	
			System.out.println(a.isprime(4));
}
}
	
//}


