package primenumber;

public class stack2 {
	public static void main(String[] args) {
		stack1 stk=new stack1(5);
		stk.pushoperation(10);
		stk.pushoperation(20);
		stk.pushoperation(30);
		System.out.println(stk.pop());//top retrive last data *30
		stk.pushoperation(40);
		stk.pushoperation(50);
		stk.pushoperation(60);
		System.out.println(stk.pop());
		//stk.pushoperation(70);
	}
}
