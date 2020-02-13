package oops.day1;

public class Hotel {
	static String name ="saravana bhavan";
	static int doorno=7;
	static int mealsrate=100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hotel customer1=new Hotel();
customer1.eat();
preparefood();
int box=customer1.paybill(100,200);
System.out.println(box);
}

	private static void preparefood() {
		// TODO Auto-generated method stub
		
	}

	private static  void Preparefood() {
		// TODO Auto-generated method stub
		
	}

	private void eat() {
		// TODO Auto-generated method stub
		System.out.println("eat well");
		//paybill();
		
		
	}

	private int paybill(int i, int j) {
		// TODO Auto-generated method stub
		float balance=35.35f;
		System.out.println(i+""+j);
		//System.out.println(j);
			return (int) balance;
		
			}
	
		}

