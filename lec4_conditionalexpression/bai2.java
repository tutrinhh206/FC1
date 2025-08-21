package lec4_conditionalexpression;
import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so tuoi cua ban: ");
        int tuoi = scanner.nextInt();
        if(tuoi>=0 && tuoi <=12){
            System.out.println("Tre em.");
        }else if(tuoi>=13 && tuoi <=19){
            System.out.println("Thanh nien.");
        }else if(tuoi>=20 && tuoi <=59){
            System.out.println("Nguoi lon.");
        }else{
            System.out.println("Nguoi gia.");
        }
    }
}
/*
0-12: Child
o 13-19: Teenager
o 20-59: Adult
o 60 and above: Senior
*/