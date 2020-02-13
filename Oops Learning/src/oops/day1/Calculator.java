package oops.day1;

public class Calculator {
	static String brand ="ABC";
	static int price =650;
	static boolean isScientific=true;
	String owner="kumar";
	void add()
	{
		int a=10,b=20,total;
		total=a+b;
		System.out.println(total);
		System.out.println(owner);
	}
	float subtract(int v1,float v2)
	{
   float result=v1-v2;
	return result;
	}
	static void scientificCalculations()
	{
		Calculator ca=new Calculator();
		System.out.println(ca.owner);
		System.out.println(brand);
		System.out.println(price);
		System.out.println(isScientific);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculator calc=new Calculator();
calc.add();
float result=calc.subtract(50,20.5f);
scientificCalculations();
	}

}
