package Roughs;
//Encapsul
public class Student {
	
	private String name;
	private int id;
	private float score;
	
	public Student(String name,int id,float score) {
		this.name = name;
		this.id = id;
		this.score=score;
	}
	
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public float getScore() {
		return score;
	}
	public void setName(String name) {
		this.name= name;
	}
	public void setId(int id) {
		this.id= id;
	}
	public void setScore(float score) {
		this.score= score;
	}
	
	
	public static void main(String[] args) {
		Student s = new Student("Sachin", 19, 83f);
		System.out.println(s.getName());
		System.out.println(s.getId());
		System.out.println(s.getScore());
		System.out.println("---------------");
		
		s.setName("Khushi");
		s.setId(18);
		s.setScore(85);
		System.out.println(s.getName());
		System.out.println(s.getId());
		System.out.println(s.getScore());
		
	}

}
