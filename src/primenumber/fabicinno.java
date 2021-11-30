package primenumber;

public class fabicinno {
  int fib(int n) {
	  if (n==1) {
		  return 1;
	  }
	  else {
	  return fib(n-1) + fib(n-2);
	  }
  }
  public static void main(String[] args) {
	  fabicinno a= new fabicinno();
	  System.out.println(a.fib(2));
  }
}
