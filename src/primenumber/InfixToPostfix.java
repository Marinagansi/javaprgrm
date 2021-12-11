package primenumber;

public class InfixToPostfix {
	static int precedence(char c) {
		switch(c) {
		case('+'):
		case('-'):
			return 1;
		case('*'):
		case('/'):
			return 2;
		case('^'):
			return 3;
		
		}
		return -1;
	}
	
	static String postfix(String exp) {
		String result="";
		stringchar stk=new stringchar(10);
		for(int i=0;i<exp.length();i++) {
			char c=exp.charAt(i);
			if(precedence(c)>0) {
				while(stk.isempty()==false && precedence(c)>stk.peek()) {
					result=result+stk.pop();
				}
				stk.push(c);
			}
			else if(c=='(') {
				stk.push(c);
			}
			else if(c==')') {
				char x=stk.pop();
				while(x!='(') {
					result=result+x;
					x=stk.pop();
				}
			}
			
			else {
				result=result+c;
			}
		}
		while(!stk.isempty()) {
			result=result+stk.pop();
		}

		return result;
	}

	public static void main(String[] args) {
//		InfixToPostfix ex=new InfixToPostfix();
//		System.out.println(ex.postfix("1+3"));
		System.out.println(postfix("a+(b*t)/b"));
		System.out.println(postfix("a+(c*d)"));
	}
}
