package AfterOops;

public class RecurssiveReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecurssiveReverse a=new RecurssiveReverse();
		a.print(3);
		System.out.println("end");

	}

	 void print(int x) {
		// TODO Auto-generated method stub
		System.out.println(x);
		x--;
		if (x>0)
		{
			print(x);
		}
		System.out.println(x);

	}

}
