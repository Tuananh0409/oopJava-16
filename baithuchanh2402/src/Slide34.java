import java.util.Scanner;

public class Slide34 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a = sc.nextInt();
    double b = sc.nextInt();
    double c = sc.nextInt();
    double x1,x2;
    double delta = b*b - 4*a*c;
    System.out.println("Pt co dang: " + a + "x^2 + " + b + "x + " + c + " = 0");
    if (delta < 0) {
        System.out.println("pt vo nghiem");
    } else if (delta == 0) {
        x1 = -b / (2 * a);
        System.out.println("pt co nghiem x = " + x1);
    } else {
        x1 = (-b + Math.sqrt(delta)) / (2 * a);
        x2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println("Pt co 2 nghiem x1 = " + x1 + " và x2 = " + x2);
    }
  }
}
