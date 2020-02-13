package AfterOops;

public class ClassA {

	ClassA()
	{
		new ClassA(5,6);//constructor call only other constructor statement 
	}
	ClassA(int a,int b)
	{
		System.out.println(a);
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	ClassA a=new ClassA();

	}

}
