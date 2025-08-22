package Lec5_Loop;
import java.util.Scanner;
public class bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input height: ");
        int height = scanner.nextInt();
        for(int h = 0; h < height ; h++)
        {
            for(int s = 0;s<height-h-1;s++)
            {
                
                System.out.print(" ");
            }
            for(int a = 0;a<h*2+1;a++)
            {
                if( (height - 1 == h || a==0 || a == h*2) )
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
