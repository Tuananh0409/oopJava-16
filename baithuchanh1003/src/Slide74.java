import java.util.Scanner;

public class Slide74 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu trong mang ");
		int n = sc.nextInt();
		int[] arr = new int[n];
        int sum = 0;
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i ++){
			if(arr[i] % 2 == 0){
				sum += arr[i];
			}
		}
        System.out.println(sum);
	}
}