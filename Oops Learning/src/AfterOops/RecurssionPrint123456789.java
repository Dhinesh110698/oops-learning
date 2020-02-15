package AfterOops;

public class RecurssionPrint123456789 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecurssionPrint123456789 n=new RecurssionPrint123456789();
		n.num(1);
		
		//n.num(3);
		//n.num(2)
		//n.num(4)
		

	}

	private int num(int i) {
		// TODO Auto-generated method stub
		if (i>9)
		{
			return 1;
		}
		if (i%3==1)
		{
			System.out.println();
		}
		System.out.print(i);
		int b=num(i+1);
				return b;
	}

}
