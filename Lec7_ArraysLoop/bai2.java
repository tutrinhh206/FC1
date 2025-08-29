package Lec7_ArraysLoop;
import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Input nu:mber in array ");
        int a=kb.nextInt();
        int[] array = new int[a];
        for(int i=0; i<a ; i++)
        {
            System.out.print("Number "+ (i+1) + " : ");
            array[i]=kb.nextInt();
        }
        for (int i = 0; i < a / 2; i++) {
            int temp = array[i];
            array[i] = array[a - 1 - i];
            array[a - 1 - i] = temp;
        }
        System.out.print("Array after reversal: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
