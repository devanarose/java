import java.util.Scanner;

class Rectangle{
    int length,width;
    public Rectangle(){
        length=0;
        width=0;
    }
    public int sram(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return 0;
            }
        }
        return 1;
    }
}
public class RectPrime {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Scanner s=new Scanner(System.in);
        try{
            // System.out.println("Enter length and width of rectangle: ");
            // int l=s.nextInt();
            // int b=s.nextInt();
            System.out.println("Enter a number: ");
            int num=s.nextInt();
            int result=r.sram(num);
            if(result == 1){
                System.out.println("The number is prime.");
            }
            else{
                System.out.println("Number is not prime");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            s.close();
        }
    }
}
