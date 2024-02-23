import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.io.*;
public class URLDownload {
    public static void main(String[] args) throws Exception {
        int i, c;
        URL u=new URL("https://www.irjmets.com/uploadedfiles/paper/issue_5_may_2023/38683/final/fin_irjmets1683962083.pdf");
        URLConnection uc=u.openConnection();
        System.out.println("Date: "+new Date(uc.getDate()));
        System.out.println("Content-type: "+uc.getContentType());
        System.out.println("Expires: "+uc.getExpiration());
        System.out.println("Last modifies: "+new Date(uc.getLastModified()));
        int len=uc.getContentLength();
        System.out.println("Content-length: "+len);
        if(len>0){
            FileOutputStream fout = new FileOutputStream("cat.pdf");
            System.out.println("========CONTENT========");
            InputStream input= uc.getInputStream();
            i=0;
            while(((c=input.read()) != -1 )&&i<len){
                fout.write((char)c);
                i++;
            }
            input.close();
            fout.close();
        }
    else{
        System.out.println("no content available");
    }
}
}
