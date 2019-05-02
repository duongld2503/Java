import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so a: " );
        double a = sc.nextDouble();

        System.out.println("nhap vao so b: ");
        double b = sc.nextDouble();

        System.out.println("nhap vao so c: ");
        double c = sc.nextDouble();

        if (a != 0){
            double x = (c - b)/a;
            System.out.println("nghiem cua phuong trinh la: " + x);
        } else if (b == c){
            System.out.println("phuong trinh vo so nghiem: ");
        } else {
            System.out.println("phuong trinh vo nghiem");
        }
    }
}