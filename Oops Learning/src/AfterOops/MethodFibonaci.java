package AfterOops;

public class MethodFibonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MethodFibonaci Fibonac=new  MethodFibonaci ();
		 int a= Fibonac.Fibonaci(10);
		 System.out.println(a);

	}
int Fibonaci(int i)
{
	int d=0,e=1;
	int sum=d+e;
	int j=2;
	while(j<i)
	{
		int f=d+e;
		sum=sum+f;
		d=e;
		e=f;
		j++;
	
}
	return sum;
}
}
