//file writing program
import java.io.*;
import java.util.*;
class FWrite{
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        String fname;
        String data;
        FileOutputStream fout;
        try{
            System.out.println("Enter the file name:");
            fname=s.nextLine();
            fout=new FileOutputStream(fname);
            System.out.println("Enter data/quit to terminate: ");
            data=s.nextLine();
            while(!data.equals("quit")){
                fout.write((data+"\n").getBytes());
                data=s.nextLine();
            }
            fout.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            s.close();
        }
    }
}
	