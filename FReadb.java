//read contents from the file: block by block
import java.io.*;
import java.util.*;
class FReadb{
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        String fname;
        FileInputStream fin;
        try{
            System.out.println("Enter the file name:");
            fname=s.nextLine();
            fin=new FileInputStream(fname);
            byte []b;
            b=new byte[5];
            int n=fin.read(b,0,5);
            while(n!=-1) {
                String data=new String(b,0,n);
                System.out.print(data);
                n=fin.read(b,0,5);
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