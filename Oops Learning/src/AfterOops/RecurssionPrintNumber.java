package AfterOops;

public class RecurssionPrintNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecurssionPrintNumber n=new RecurssionPrintNumber();
		n.num(1);

	}

	private int num(int i) {
		if(i>5)
		{
			return 1;
		}
	System.out.println(i);	
	int k=num(i+1);
	
	
	
	return k;
		
		
	}

}
