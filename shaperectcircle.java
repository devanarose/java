import java.io.*;
interface shape {
    public void disp();
    public void calc();
}

class rectangle implements shape {
    double l,b,w,volume;
    public rectangle(double l,double b,double w) {
        this.l=l;
        this.b=b;
        this.w=w;
    }
    public void calc() {
        volume=l*b*w;
    }
    public void disp() {
        System.out.println("Volume of rectangle: "+volume);
    }
}

class circle implements shape {
    double area,r;
    public circle(double r) {
        this.r=r;
    }
    public void calc() {
        area=3.14*r*r;
    }
    public void disp() {
        System.out.println("area of Circle: "+area);
    }
}

public class shaperectcircle {
    public static void main(String args[]){
        shape obj[];
        int n,i,ch;
        DataInputStream din=new DataInputStream(System.in);
        try {
            System.out.print("Enter no: of objects : ");
            n=Integer.parseInt(din.readLine());
            obj=new shape[n]; 
            for(i=0;i<n;i++) {
                System.out.println("1.RECTANGLE\n2.CIRCLE\nENTER CHOICE");
                ch=Integer.parseInt(din.readLine());
                if(ch==1) {
                    double l,b,w;
                    System.out.print("Enter length,breadth and width: ");
                    l=Double.parseDouble(din.readLine());
                    b=Double.parseDouble(din.readLine());
                    w=Double.parseDouble(din.readLine());
                    obj[i]=new rectangle(l,b,w);
                }
                else{
                    double r;
                    System.out.print("Enter radius: ");
                    r=Double.parseDouble(din.readLine());
                    obj[i]=new circle(r);
                }
            }
            for(i=0;i<n;i++) {
                obj[i].calc();
                obj[i].disp();
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
