//read contents from the file: CHARACTER BY CHARACTER
import java.io.*;
import java.util.*;
class FRead{
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        String fname;
        FileInputStream fin;
        try{
            System.out.println("Enter the file name:");
            fname=s.nextLine();
            fin=new FileInputStream(fname);
            int ch;
            ch=fin.read();
            while(ch!=-1){
                System.out.print((char)ch);
                ch=fin.read();
            }
            fin.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            s.close();
        }
    }
}