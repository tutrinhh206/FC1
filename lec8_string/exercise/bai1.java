package lec8_string.exercise;
import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Nhap cau: ");
        String cau = scanner.nextLine();
        String[] mang = cau.split("\\s+");
        System.out.print("Cac tu dao nguoc: ");
        for(int i=mang.length-1; i>=0; i--){
            System.out.print(mang[i]);
            if (i>0) System.out.print(" ");
        }
        System.out.println();
    }
}
