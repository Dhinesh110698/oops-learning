package AfterOops;

public class MethodUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodUpperCase up=new MethodUpperCase();
		char b=up.upper('c');
		System.out.println(b);
		MethodUpperCase low=new MethodUpperCase();
		char g=low.lower('A');
		System.out.println(g);

	}
	
	char upper(char a)
	{
		char b;
		b=(char)(a-32);
		return b;
		
	}
	private char lower(char g)
	{
		char f;
		f=(char)(g+32);
		return f;
}
}
