package Roughs;

public class Frequency {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 5, 5, 6, 4, 6, 7 };

		int[] visitedarr = new int[arr.length];
		int visited = -1;

		for (int i = 0; i < arr.length; i++) {
			int count = 1;

			for (int j = i + 1; j < arr.length; j++) {
				
				if (arr[i] == arr[j]) {
					count++;
					visitedarr[j] = visited;
				}

			}
			
			if (visitedarr[i] != visited) {
				visitedarr[i]=count;
			}

		}
		
		for (int i = 0; i < visitedarr.length; i++) {
			if (visitedarr[i] != visited) {
				System.out.println("Freq of "+arr[i]+" : "+visitedarr[i]);
			}
		}

	}

}
