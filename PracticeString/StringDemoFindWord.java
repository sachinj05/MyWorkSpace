package PracticeString;

public class StringDemoFindWord {

	public static void main(String[] args) {
		String str = "helloslkhellodjladfjhello";
		String s = "hello";
		int x = count(str,s);
		System.out.println(x + " times present"); 
		
	}
	public static int count(String str1, String s) {
		int l1 = str1.length();
		String str2 = str1.replace(s, "");
		int l2 = str2.length();
		int l3 = s.length();
		int rs = (l1-l2)/l3;
				
				
	    return rs;
	}

}
