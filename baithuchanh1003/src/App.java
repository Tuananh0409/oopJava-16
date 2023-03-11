import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu trong mang");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}
		for(int i =0; i < n; i++){
			for(int j = i + 1; j < n; j++){
				if(arr[i] > arr[j]){
					// Neu arr[i] > arr[j] thi hoan doi gia tri cua arr[i] va arr[j]
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i = 0; i < n; i++){
			System.out.print(arr[i] + " ");
		}
	}
}