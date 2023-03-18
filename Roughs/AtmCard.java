package Roughs;

public class AtmCard {
	private String name;
	private long cno;
	private int cvv;
	public AtmCard(String name, long cno, int i) {
		this.name = name;
		this.cno = cno;
		this.cvv = i;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/////////////////////////////////////

	public long getCno() {
		return cno;
	}

	public void setCno(long cno) {
		this.cno = cno;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	
	
	public static void main(String[] args) {
		AtmCard a = new AtmCard("sbi", 1234559123,123);
		System.out.println(a.getCno());
		a.setCno(987651123);
		System.out.println(a.getCno());

		
		
	}
	
	
	
	

}
