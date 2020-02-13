package AfterOops;

public class Recurssive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recurssive a=new Recurssive();
		a.print(1);
		

	}

	void print(int x) {
		// TODO Auto-generated method stub
		System.out.println(x);
		x++;
		if (x<3)
		{
			print(x);
		}
		System.out.println(x);
	}

}
