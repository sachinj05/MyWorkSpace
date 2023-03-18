package StringPackage;

public class ReverseEachWordStr {
	public static void main(String[] args) {
		StringOperation so = new StringOperation();
		String st = so.strInput();
		String[] str = st.split(" ");
		String res = "";
		String sp = " ";
		for (int i = 0; i < str.length; i++) {
			String s = str[i];
			char[] ch = s.toCharArray();
			for (int j = ch.length - 1; j >= 0; j--) {
				res += ch[j];

			}
			res += sp;

		}
		System.out.print(res);
	}

}

//rama is a    good boy  
//amar si a    doog yob 