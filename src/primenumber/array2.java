package primenumber;
// insert data intoo existing array
public class array2 {
	public static int a[]=new int[6];
	static int n=0;
	
	array2(){
		for(int i=0;i<5;i++) {
			n++;
			a[i]=n;
		}}
	
	static void insert(int pos,int data) {
		for(int i=n-1;i>=pos-1;i--) {
			a[i+1]=a[i];
		}
		a[pos-1]=data;
		n++;
	
		
	}
	static void removepos(int pos) {
		for (int i=pos-1;i<n-1;i++) {
			a[i]=a[i+1];
			
		}
		n--;
	}
	public static void main(String [] args) {
		array2 b=new array2();
		System.out.println("printing old data");
		for(int i=0;i<n;i++){
			System.out.println(a[i]);
		}
		insert(3,8);
		System.out.println("printing new data");
		for(int i=0;i<n;i++){
			System.out.println(a[i]);
	}
		removepos(4);
		System.out.println("removing  data");
		for(int i=0;i<n;i++){
			System.out.println(a[i]);
	}
	}
}
