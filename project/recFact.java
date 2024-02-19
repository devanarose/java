import java.util.*;
import java.io.*;
public class recFact {

        public static void main(String args[]) {
            int n;
            Scanner s=new Scanner(System.in);
            System.out.print("Enter number: ");
            n = s.nextInt();
            float factorial = fact(n);
            System.out.println("Factorial of " + n + " = " + factorial);
        }

        public static float fact(int n)
        {
            if (n >= 1)
                return n * fact(n - 1);
            else
                return 1;
        }
}
