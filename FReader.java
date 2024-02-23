import java.io.*;
public class FReader {
    public static void main(String[] args) {
        FileReader fr;
        BufferedReader br;
        try{
            fr=new FileReader(new File("a.txt"));
            br=new BufferedReader(fr);
            String data=br.readLine();
            while(data!=null){
                System.out.println(data);
                data=br.readLine();
            }
            br.close();
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
