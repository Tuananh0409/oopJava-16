import java.text.DecimalFormat;
import java.util.Scanner;
 
public class Bai8 {
 
    public static void main(String[] args) {
        int n, sum = 0, number;
        float avgNumber;
        Scanner sc = new Scanner(System.in);
         
        // làm tròn đến 2 chữ số thập phân
        DecimalFormat decimalFormat = new DecimalFormat("#.##");    
         
        System.out.println("Nhap vao so cac so nguyen co trong day: ");
        n = sc.nextInt();
         
        /*
         * bắt đầu duyệt từ biến đếm count = 1 
         * nếu count còn <= n thì nhập vào số number thứ count
         * sau đó cộng giá trị của biến number vào biến sum
         * vòng lặp dừng khi biến đếm count > n.
         */
        for (int count = 1; count <=n; count++) {
            System.out.println("Nhap so thu " + count + ": ");
            number = sc.nextInt();
            sum += number;
        }
         
        avgNumber = (float) sum / n;
        System.out.println("Trung binh cong = " + decimalFormat.format(avgNumber));
    }
 
}
