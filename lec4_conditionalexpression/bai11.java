package Lec4;
import java.util.Scanner;
public class bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first coefficient: ");
        int a = scanner.nextInt();
        System.out.print("Enter second coefficient: ");
        int b = scanner.nextInt();
        System.out.print("Enter third coefficient: ");
        int c = scanner.nextInt();
        if(a == 0)
        {
            double x = -c/b;
            System.out.println("This is a linear equation. The equation has one root: x = " + x);
        }
        else
        {
            double delta = b*b - 4*a*c;
            if(delta < 0)
            {
                System.out.println("The equation has no real roots");
            }
            else if(delta == 0)
            {
                double x = -b/(2*a);
                System.out.println("The equation has a double root: x1 = x2 = " + x);
            }
            else
            {
                double x1 = (-b + Math.sqrt(delta))/(2*a);
                double x2 = (-b - Math.sqrt(delta))/(2*a);
                System.out.println("The equation has two distinct roots: x1 = " + x1 + " and x2 = " + x2);
            }
        }
    }
}