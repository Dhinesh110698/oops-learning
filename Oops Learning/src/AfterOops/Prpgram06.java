package AfterOops;

public class Prpgram06 {
	
	int x;
	void add() {
		x++;
	}
	void sub() {
		x--;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prpgram06 p1=new Prpgram06();
		Prpgram06 p2=new Prpgram06();
		p1.x=10;
		p1.add();
		p2.sub();
		System.out.println(p1.x);
		System.out.println(p2.x);
		
		

	}

}
