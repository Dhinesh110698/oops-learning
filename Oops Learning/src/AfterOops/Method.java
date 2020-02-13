package AfterOops;

public class Method {
	int x=5;
	static int y=10;
	
	void m1() {
		y=x;
		
	}
	void m2() {
		x++;
	}

	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Method  a1= new Method (); 
		Method  a2= new Method ();
		Method  a3= new Method ();
		
	a2.m1();
	a3.m2();
	
	a1.y++;
	a1.m1();
	a2.m2();
	System.out.println(a1.x);
	System.out.println(a2.x);
	System.out.println(a3.x);
	System.out.println(a1.y);
			
		}

	}


