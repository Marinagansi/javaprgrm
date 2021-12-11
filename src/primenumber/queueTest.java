package primenumber;

public class queueTest {
public static void main(String[] args) {
	queueee q=new queueee(5);
	q.enqueue(10);
	q.enqueue(20);
	q.enqueue(30);
	System.out.println(q.dequeue());
	System.out.println(q.dequeue());
}

}
