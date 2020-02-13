package AfterOops;

public class RecurrsionFactorialwithoutinstacevariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 RecurrsionFactorialwithoutinstacevariable f=new  RecurrsionFactorialwithoutinstacevariable();
	int result=	 f.fac(3);
System.out.println(result);
	}

	 int fac(int n) {
		// TODO Auto-generated method stub
		if(n==1)
		{
	return 1;
		}
		int k=fac(n-1);
		return k*n;
		
	}

}
