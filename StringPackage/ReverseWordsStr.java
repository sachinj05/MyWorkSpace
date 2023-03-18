package StringPackage;

public class ReverseWordsStr {
	public static void main(String[] args) {
StringOperation so = new StringOperation();
		String st = so.strInput();
		String[] str = st.split(" ");
		String res = "";
		String sp = " ";
		for (int i = 0; i < str.length; i++) {
			String s = str[i];
			res = s+sp+res;
		}
		System.out.print(res);
	}
}


//rama is a    good boy  
//boy good    a is rama   