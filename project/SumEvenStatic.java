//WAP to display even numbers upto ‘n’ using a static function.
import java.util.*;
import java.io.*;
public class SumEvenStatic {
        public static void main(String args[]) {
            int n;
            Scanner s=new Scanner(System.in);
            System.out.print("Enter limit: ");
            n = s.nextInt();
            even(n);
        }

        public static void even(int n)
        {
            System.out.println("Even numbers upto n:");
            for(int i=2;i<=n;i++){
                if(i%2==0){
                    System.out.println(i);
                }
            }
        }


}
