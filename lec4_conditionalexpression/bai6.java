package lec4_conditionalexpression;
import java.util.Scanner;
public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Nhap diem trung binh: ");
        Double dtb = scanner.nextDouble();
        if(dtb>=9.0 && dtb<=10){
            System.out.println("Xuat sac.");
        }else if(dtb>=8.0 && dtb<=8.9){
            System.out.println("Gioi.");
        }else if(dtb>=6.5 && dtb<=7.9){
            System.out.println("Kha.");
        }else if(dtb>=5.0 && dtb<=6.4){
            System.out.println("Trung binh.");
        }else{
            System.out.println("Yeu.");
        }
    }
}
