package lec4_conditionalexpression;
import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so (1-7): ");
        int so = scanner.nextInt();  // đọc số nguyên

        switch (so) {
            case 1: System.out.println("Chu nhat."); break;
            case 2: System.out.println("Thu 2."); break;
            case 3: System.out.println("Thu 3."); break;
            case 4: System.out.println("Thu 4."); break;
            case 5: System.out.println("Thu 5."); break;
            case 6: System.out.println("Thu 6."); break;
            case 7: System.out.println("Thu 7."); break;
            default: System.out.println("Khong hop le!");
                    
        }
    }
}
