import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char ch;
        String nstr="";
        System.out.println("Enter a String: ");
        String str=s.nextLine();
        try {
            for(int i=0;i<str.length();i++)
            {
                ch= str.charAt(i); //extracts each character
                nstr=ch+nstr; //adds each character in front of the existing string
            }
            System.out.println("Reversed String: "+nstr);
            if(nstr.equals(str)){
                System.out.println("Palindrome ");
            }
            else{
                System.out.println("Not Palindrome ");
            }
        } catch (Exception e) {
           System.out.println(e);
        }
        finally{
            s.close();
        }
    }
}
