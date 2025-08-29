package Lec7_ArraysLoop;
import java.util.Scanner;
public class bai3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter number of array: ");
        int a=kb.nextInt();
        int[] array = new int[a];
        for(int i=0;i<a;i++)
        {
            System.out.print("Number "+(i+1)+" : ");
            array[i]=kb.nextInt();
        }
        System.out.print("Enter X: ");
        int x=kb.nextInt();
        int b=0;
        for(int i=0;i<a;i++)
        {
            if(array[i]==x)
            {
                b++;
            }
        }
        System.out.println("The number "+x+" appear "+b+ " times");
    }
}
