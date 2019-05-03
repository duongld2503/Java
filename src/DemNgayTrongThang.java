import java.util.Scanner;

public class DemNgayTrongThang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ban muon dem ngay cua thang nao? ");
        int month = sc.nextInt();

        String daysInMonth;
        switch (month){
            case 2:
                daysInMonth = "29";
//                System.out.println("ngay cua thang " + month + " la " + daysInMonth + " ngay");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = "31";
//                System.out.println("ngay cua thang " + month + " la " + daysInMonth + " ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = "30";
//                System.out.println("ngay cua thang " + month + " la " + daysInMonth + " ngay");
                break;
            default:
                daysInMonth = " ";
        }

        System.out.println("ngay cua thang " + month + " la " + daysInMonth + " ngay");
    }

}
