package primenumber;
//insert data into new array
public class arrayp {
	int [] insertaray(int a[],int n,int pos,int data) {
		int x[]=new int[n+1];
		for (int i=0;i<n+1;i++) {  
			if(i<pos-1) {
				x[i]=a[i];
			}
			else if (i==pos-1) {
				x[i]=data;
				
			}
			else {
				x[i]=a[i-1];
			}
			
			
		}
		return x;
		
	}
	public static void main(String[] args) {
//		arrayp b=new arrayp();
		int a[]= {10,20,30,40,50};
		//int x[]=new int[]
//		a[0]=10;
//		a[1]=20;
//		a[2]=30;
//		a[3]=40;
//		a[4]=50;
		int n=5;//b.lenght for 
		int pos=3;
		int data=25;
		System.out.println("printing old data");
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
		
		arrayp b=new arrayp();
		int x[]=b.insertaray(a,n,pos,data);
		System.out.println("printing new data");
		for(int i=0;i<a.length;i++) {
			System.out.println(x[i]);
		
			
			
			
		}
	}

}
