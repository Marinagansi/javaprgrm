package primenumber;

public class stringchar2 {//check parenthesis
	
	public boolean checkbalance(String exp) {
		stringchar stk=new stringchar(5);
		String openbraces="{[(";
		String closebraces="}])";
		
		for(int i=0;i<exp.length();i++) {
			
			char braces=exp.charAt(i);//provide index value;
			if(braces=='['||braces=='{'||braces=='('){ //BRACES MEANS BRACKET
				stk.push(braces);	
			}
			else {
			char popbracket=stk.pop();
			int closedbracketindex=closebraces.indexOf(braces);
			char correspondingopenbracket=openbraces.charAt(closedbracketindex);
			
			if(popbracket!=correspondingopenbracket) {
				
			}
			}
			
			
		}
		if(stk.isempty()) {
			return true;
		}
		return false;
	}
	public static void main(String[]args) {
		stringchar2 c=new stringchar2();
		System.out.println(c.checkbalance("{(}"));
		
	}

}
