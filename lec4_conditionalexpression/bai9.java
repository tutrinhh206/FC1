package Lec4;
import java.util.Scanner;
public class bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int x = scanner.nextInt();
        if(x<0)
        {
            x = x - ( 2 * x );
        }
        else
        {
            x = x;
        }
        System.out.println("The absolute value is "+x);
    }
}
