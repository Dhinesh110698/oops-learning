package AfterOops;

public class MethodSumOfSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MethodSumOfSeries series=new  MethodSumOfSeries();
		int c= series.SumOfSeries(5);
		System.out.println(c);

	}
int SumOfSeries(int a)
{
int b=1,sum=0;
for (b=1;b<=a;b++)
{
sum=sum+b;
}
return sum;
}
}
