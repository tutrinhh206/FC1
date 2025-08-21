package lec4_conditionalexpression;
import java.util.Scanner;
public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap nam: ");
        int nam = scanner.nextInt();
        if(nam%4 == 0 && nam%100 != 0 || nam % 400 == 0){
        System.out.println(nam+" la nam nhuan.");
        }else{
             System.out.println(nam+"khong phai la nam nhuan.");
        }
    }
}
