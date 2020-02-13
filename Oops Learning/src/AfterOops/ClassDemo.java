package AfterOops;

public class ClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassAConstractor A=new ClassAConstractor(10);
		A.add();
		ClassBConstractor B=new ClassBConstractor(20);
		B.add();
		B.sub();
		 ClassCConstractor C=new  ClassCConstractor(30);
		System.out.println(C.a);
		System.out.println(C.b);
		System.out.println(B.a);
		
	}

}
