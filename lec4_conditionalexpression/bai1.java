package lec4_conditionalexpression;
import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so: ");
        int n = scanner.nextInt();
        if(n%2 == 0){
            System.out.println(n+" la so chan.");
        }else{
            System.out.println(n+" la so le.");
        }
    }
}
