import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so kiem tra: ");
        int num = sc.nextInt();

//        public static soNguyenTo(num){
            int count = 1;
            for (int i = 2; i < num; i++){
                if (num % i == 0){
                    count++;
                }
            }

            if (count == 2){
                System.out.println("day la so nguyen to");
            }
//        }
    }
}
