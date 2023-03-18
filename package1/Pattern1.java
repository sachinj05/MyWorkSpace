package package1;

public class Pattern1 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n; j++) {
				int k = 1;
				k=k+(i*10)+j*2;
				System.out.print(k+"  ");				
			}
			System.out.println();
		}
	}
}
