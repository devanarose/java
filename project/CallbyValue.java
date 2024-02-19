import java.util.Scanner;
public class CallbyValue {
    public static void main(String[] args) {
        float n1,n2;
        Scanner s=new Scanner(System.in);
        try{
            System.out.println("Enter 2 numbers (FLOAT):");
            n1=s.nextFloat();
            n2=s.nextFloat();
            System.out.println("Numbers before swapping: n1 = "+n1+" n2= "+n2);
            swap(n1,n2);
        }catch(Exception e){
            System.out.println(e);
        }
        finally{
            s.close();
        }
    }
    public static void swap(float x,float y){
        float temp;
        temp=x;
        x=y;
        y=temp;
        System.out.println("After Swapping : n1="+x +" and n2="+y);
}}
