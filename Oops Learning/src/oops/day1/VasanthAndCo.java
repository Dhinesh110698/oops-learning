package oops.day1;

public class VasanthAndCo {
	static String branch ="chennai";
	static int code =1234;
	int discount,productprice;
	

	public VasanthAndCo(int i, int j) {
		// TODO Auto-generated constructor stub
		//System.out.println("check me when i am call");
		//System.out.println(i+" "+j);
		productprice=i;
		discount=j;
		}

	public VasanthAndCo(int i) {
		// TODO Auto-generated constructor stub
		productprice=i;
	}

	public VasanthAndCo() {
		// TODO Auto-generated constructor stub
		System.out.println("calendar free");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 VasanthAndCo tv=new  VasanthAndCo(10000,10);
		 tv.purchase();
		 VasanthAndCo ac=new  VasanthAndCo(30000,10);
		 ac.purchase();
		 VasanthAndCo fan=new  VasanthAndCo(2000);
		 fan.purchase();
		 VasanthAndCo calendrr=new  VasanthAndCo();
		 
	}

	private void purchase() {
		// TODO Auto-generated method stub
		int price =productprice-((productprice*discount/100));
		System.out.println("please pay"+price);
		
		
	}



}
