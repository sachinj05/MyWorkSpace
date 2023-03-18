package Roughs;

public class C5 {
	{
		System.out.println("non static block");
	}
	static {
		System.out.println("static block");
	}
	
	static void m1(){
		System.out.println("method m1");
	}
	void m2(){
		System.out.println("method m2");
	} 
	
	public static void main(String[] args) {
		C5 obj = new C5();
		m1();
		obj.m2();

	}

}
