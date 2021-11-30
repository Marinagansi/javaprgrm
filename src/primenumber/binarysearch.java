package primenumber;

public class binarysearch {
	boolean binary(int ar[],int data,int start,int end)
	{
		int mid=(start+end)/2;
	if (ar[mid]>data) {
		return binary(ar,data,start,end);
	}
		else if(ar[mid]<data)
		{
			return binary(ar,data,mid+1,end);
		}
		else if (ar[mid]==data) {
			return true;
		}
		else {
			return false;
		}
	}

	

	public static void main(String[] args) {
		binarysearch a=new binarysearch();
		int ar[]= {1,2,3,4,5,6,7,8};
		int data=5;
		int start=0;
		int end=ar.length-1;
		
		System.out.println(a.binary(ar,data,start,end));
	}
}

	

