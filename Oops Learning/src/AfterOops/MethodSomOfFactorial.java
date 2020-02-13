package AfterOops;

public class MethodSomOfFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodSomOfFactorial fac=new MethodSomOfFactorial();
		int b=fac.Fact(10);
		System.out.println(b);
	}
int Fact(int a)
{
	
	int fact =1;
	int i =1;
	while (i<=a)
	{
		fact=fact*i;
		i++;
	}
	return fact;
}

}
