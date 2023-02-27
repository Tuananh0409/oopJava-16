import java.util.Scanner; 

public class Slide35 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap vao 2 so nguyen: ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    if(a >= b){
        System.out.println("so nho nhat trong 2 so la " + (b));
    }
    else{
        System.out.println("so nho nhat trong 2 so la " + (a));
    }
    
   } 
}
