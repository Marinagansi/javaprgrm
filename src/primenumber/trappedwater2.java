package primenumber;

public class trappedwater2 {
	int trappedwater(int[] height) {
		int ans=0;
		int  n= height.length;
		int leftmax[]=new int[n];
		int rightmax[]=new int[n];
		leftmax[0]=height[0];
		for(int i=1;i<n;i++) {
			leftmax[i]=Math.max(height[i], leftmax[i-1]);
		}
		rightmax[n-1]=height[n-1];
		for(int i=n-2;i>=0;i--) {
			rightmax[i]=Math.max(height[i], rightmax[i+1]);
		}
		for(int i=0;i<n;i++) {
		ans=ans+(Math.min(leftmax[i], rightmax[i])-height[i]);
		}
		return ans;
	
	}
	public static void main(String[] args)
	{
		trappedwater2 c= new trappedwater2();
		int heiht[]= {2,3,1,2,5};
	
		int a=c.trappedwater(heiht);
		System.out.println(a);
		System.out.println( + c.trappedwater(heiht));
				
				}
}
