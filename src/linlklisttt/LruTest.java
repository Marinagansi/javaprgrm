package linlklisttt;

public class LruTest {
public static void main(String[] args) {
	LRUCaching aa=new LRUCaching(6);
	aa.put(1, 200);
	aa.put(2, 300);
	aa.put(3, 400);
	System.out.println(aa.get(3));
	
	
}
}
