package Lec4;
import java.util.Scanner;
public class bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = scanner.nextDouble();
        System.out.print("Enter y: ");
        double y = scanner.nextDouble();
        if (x > 0 && y > 0) 
        {
            System.out.println("Point is in Quadrant 1");
        } else if (x < 0 && y > 0) 
        {
            System.out.println("Point is in Quadrant 2");
        } else if (x < 0 && y < 0) 
        {
            System.out.println("Point is in Quadrant 3");
        } else if (x > 0 && y < 0) 
        {
            System.out.println("Point is in Quadrant 4");
        } else if (x == 0 && y == 0) 
        {
            System.out.println("Point is at the Origin");
        } else 
        {
            System.out.println("Point is on an axis");
        }
    }
}