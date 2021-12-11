package primenumber;
/* how much water can be trapped for the given heights*/
public class trappedwater {

	int trappwater(int height[] ){
		int ans=0;
	 int n=height.length;
	 for (int i=0;i<n;i++) {
		 
		 int leftmax=height[i]; 
		 for (int j=i-1;j>=0;j--) {
			 leftmax=Math.max(leftmax,height[j]);
		 }
		 int rightmax=height[i];
		 for(int j=i+1;j<n;j++) {
			 rightmax=Math.max(rightmax,height[j]);
			 
		 }
		 ans=ans+(Math.min(rightmax,leftmax)-height[i]); 
	 }
	return ans;
	 
	 
	 
			}
	
	public static void main(String[] args)
	{
		trappedwater c= new trappedwater();
		int heiht[]= {2,3,1,2,5};
		System.out.println("helloe2");
		int a=c.trappwater(heiht);
		System.out.println(a);
		System.out.println("this is" + c.trappwater(heiht));
				
				}
}
