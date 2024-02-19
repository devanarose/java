import java.util.*;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        float n;
        System.out.println("Enter a number:");
        n = s.nextFloat();
        
        if (n < 0) {
            System.out.print("Negative number, no square root.");
        } else {    
            System.out.println("Square root: "+Math.sqrt(n));
        }
    }
}
