package AfterOops;

public class Recurrssiontable5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recurrssiontable5 t=new Recurrssiontable5();
		t.mul();

	}
	int i=1,n=5,m;
	void mul() {
		// TODO Auto-generated method stub
		m=n*i;
		System.out.println(m);
		if(i<10)
		{
			i++;
			mul();
		}
		
	}

}
