package AfterOops;

public class MethodReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodReverseNumber Reverse=new MethodReverseNumber();
		int c=Reverse.Re(5);
		System.out.println(c);
		

	}
	int Re(int a)
	{
	int b=a;
	while(b>1)
	{
		System.out.println(b);
		b--;
	}
return b;
}
}