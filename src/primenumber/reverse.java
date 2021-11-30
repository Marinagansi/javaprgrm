package primenumber;

public class reverse {
public static void main(String [] args) {
	int num=798;
	int reversed =0;
	
	//loop run until it is zero
	while ( num!=0) {
		int digit= num%10;// get last digit from num
		reversed=reversed*10+digit;
		
		num/=10; // remove the last digit from num
		}
	System.out.println(reversed);
	
}
}
