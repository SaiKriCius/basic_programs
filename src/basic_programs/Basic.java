package basic_programs;

public class Basic {
	static void slectionsort(int[] arr,int n) {
		for (int i = 0; i < n-1; i++) {
			for (int j = i+1; j < n; j++) {
				if (arr[j]<arr[j-1]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j] = temp;
				}
			}
		}	
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}

	public static void main(String[] args) {
		int n=6;
		int[] arr = {25, 47, 3, 92, 58, 17};
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		slectionsort(arr,n);
		
	
	}
}
