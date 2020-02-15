package AfterOops;

public class RecurssionPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecurssionPattern p=new RecurssionPattern();
		p.matrix(6);

	}
int r=1;
	private int matrix(int i) {
		// TODO Auto-generated method stub
		int j=i;
		if(r>i*j)
		{
			return 1;
		}
		if (r%i==1)
		{
			System.out.println();
		}
		System.out.print(r+"  ");
		r++;
		int a=matrix(i);
		return a;
	}

}
