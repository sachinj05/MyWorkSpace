package Roughs;

public class C {
	public static void main(String[] args) {
		String s1 = "entairtainment";
		int count =0;
		for (int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i)=='e')
				count++;
		}
		System.out.println(count);
	}

}
