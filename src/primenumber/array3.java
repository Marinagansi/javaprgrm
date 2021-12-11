package primenumber;

import java.util.Arrays;
/*find the position of 2 in the array{8,4,1,1,2,2,2}*/

public class array3 {
	
//	int check(int[]num,int t) {
//		int len=num.length;
//		int i=0;
//		if(num[i]==t) {
//			System.out.println(i);
//			}
//		return t;
//		
//	}

	public static void main(String[] args) {
		int[] num= {8,4,1,1,2,2,2};
		int data=2;
	  Arrays.sort(num);
	  System.out.println("this is sorted array");
	  for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
			
			}
	
      
		System.out.println("position of 2");
		for( int j=0;j<num.length;j++) {
			if(num[j]==2)
			System.out.println(j+1);
			
			}
		
		}
		

		}

