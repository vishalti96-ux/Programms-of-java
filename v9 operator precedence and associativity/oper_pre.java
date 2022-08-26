package vtplus;

public class oper_pre{
	public static void main(String[] args){
		//precedence & Associativity
		
		int a = 6*5-34/2;
		System.out.println(a);
		/* Highest precedence goes to * and /. they are  evaluated on the basis of left to right associativity
		=30-34/2
		=30-17
		=13
		*/
		int b = 60/5-34*2;
		System.out.println(b);
	}
}