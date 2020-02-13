package AfterOops;

public class ClassBConstractor extends ClassAConstractor{
	int b=20;
	void sub()
	{
		a++;
		b++;
		
	}
	ClassBConstractor(int a)
	{
		super(a++);
		b=a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
