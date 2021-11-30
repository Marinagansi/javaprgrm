package primenumber;

public class fibonacci {
//	public static void main(String [] args) {
		int prev=0;
		int next=0;
		int current=1;
//		for (int i=2;i<=6;i++) {
//			next=prev+current;
//			prev=current;
//			current=next;
//			
//		}
//		System.out.println(next);
//	
//	}
 int fibo(int n) {
	 if (n==1) {
		  return 1;
	  }
	 else {
		for (int i=2;i<=n;i++) {
			next=prev+current;
			prev=current;
			current=next;
			
		}}
	return next;
	 
 }
 public static void main(String[] args) {
	  fibonacci a= new fibonacci();
	  System.out.println(a.fibo(6));
 }
}
