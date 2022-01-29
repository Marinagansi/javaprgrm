package primenumber;

public class cicularTest {
	public static void main(String [] args) {
		circularQueuee q=new circularQueuee(4);
		q.enqueue(4);
		q.enqueue(3);
		q.enqueue(2);
		q.enqueue(1);
		System.out.println(q.dequeue());
		
	}

}
