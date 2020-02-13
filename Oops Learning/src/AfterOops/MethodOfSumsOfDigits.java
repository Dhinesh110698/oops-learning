package AfterOops;

public class MethodOfSumsOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOfSumsOfDigits h=new MethodOfSumsOfDigits();
		int a1 =h.SumOfDigits(543);
		System.out.println(a1);
		int a2 =h.SumOfDigits(1234);
		System.out.println(a2);

	}
	int SumOfDigits(int a)
	{
		int b=0,n;
		while(a>0)
			{
				n=a%10;
			a=a/10;
			b=b+n;
			
			}
		return b;
			//System.out.println(b);
			}
	


	
	}


