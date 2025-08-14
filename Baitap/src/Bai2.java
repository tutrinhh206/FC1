
public class Bai2 {
    public static void main(String[] args) {
        System.out.println("Exercise 1:");
        System.out.println(1 + 2);          
        System.out.println(3.5 + 8);        
        System.out.println(1 / 2);          
        System.out.println(4.5 + 7);        
        System.out.println(4 * 5 + 1);      
        System.out.println(20 % 3 + 2 - 7); 
        int x = 1;
        int y = x + ++x - x-- - x++ + x - x--;
        System.out.println("\nExercise 21:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        x = 1;
        int z = x - x-- - x++ + --x - x + x-- + x;
        System.out.println("\nExercise 22:");
        System.out.println("x = " + x);
        System.out.println("z = " + z);
    }
}
