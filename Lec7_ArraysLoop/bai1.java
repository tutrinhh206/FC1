package Lec7_ArraysLoop;
import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Input nu:mber in array ");
        int a=kb.nextInt();
        int[] array = new int[a];
        for(int i=0;i<a;i++)
        {
            System.out.print("Number "+ (i+1) + " : ");
            array[i]=kb.nextInt();
        }
        int max=array[0];
        int min=array[0];
        for(int i=0;i<a;i++)
        {
            if(array[i]>max)
            {
                max=array[i];
            }
            if(array[i]<min)
            {
                min=array[i];
            }
        }
        System.out.println("The maximum value is: "+ max+ ", The minimum value is: "+min);
    }
}