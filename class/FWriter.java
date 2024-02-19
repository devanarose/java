import java.io.*;
import java.util.Scanner;
public class FWriter {
    public static void main(String[] args) {
        FileWriter fw;
        BufferedWriter bw;
        Scanner s=new Scanner(System.in);
        try{
            fw=new FileWriter(new File("a.txt"));
            bw=new BufferedWriter(fw);
            System.out.println("Enter data/quit to terminate");
            String data=s.nextLine();
            while(!data.equals("quit")){
                bw.write(data+"\n");
                data=s.nextLine();
            }
            bw.close();
        } catch(Exception e){
            System.out.println(e);
        }
        finally{
            s.close();
        }
    }
}


