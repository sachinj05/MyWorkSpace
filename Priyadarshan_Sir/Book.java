package Priyadarshan_Sir;

public class Book {
	String title;
	int price;
	
	public Book(String title,int price) {
		this.title=title;
		this.price=price;
	}
	
	
	public String toString() {
		return title +"             "+ price;

	}

	
	public static void main(String[] args) {
		Book [] b = new Book [3];
		
		b[0] = new Book ("JAVA" , 999);
		b[1] = new Book ("SQL" , 559);
		b[2] = new Book ("J_SCRIPT" , 399);
		
		
		System.out.println(b[0].title);
		System.out.println(b[1].price);
		System.out.println(b[2].title);
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);

	}
	
	
}

