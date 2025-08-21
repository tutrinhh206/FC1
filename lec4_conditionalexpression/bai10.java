package Lec4;
import java.util.Scanner;
public class bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first lengths: ");
        int a= scanner.nextInt();
        System.out.print("Enter second lengths: ");
        int b= scanner.nextInt();
        System.out.print("Enter third lengths: ");
        int c= scanner.nextInt();
        if( a + b < c || b + c < a || a + c < b)
        {
            System.out.println("These sides cannot form a triangle");
        }
        else
        {
            if(a == b && b == c)
            {
                System.out.println("This is an equilateral triangle");
            }
            else if(a != b && a != c)
            {
                System.out.println("This is an scalene triangle");
            }
            else
            {
                System.out.println("This is an isosceles triangle");
            }
        }
    }
}
