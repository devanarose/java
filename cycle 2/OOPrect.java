import java.util.Scanner;

class Rectangle{
    int l,b;
    public Rectangle(){
        l=0;b=0;
    }
    public Rectangle(int l,int b){
        this.l=l;
        this.b=b;
    }
    public int sameArea(Rectangle r){
        //Scanner s=new Scanner(System.in);
        int area=l*b;
        int areaa=r.l*r.b;
        if(area==areaa){
            return 1;
        }
        else{
            return 0;
        }
    }
}

public class OOPrect{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length and breadth of first rectangle 1:");
        try{
            int l1=s.nextInt();
            int b1=s.nextInt();
            System.out.println("Enter the length and breadth of first rectangle 2:");
            int l2=s.nextInt();
            int b2=s.nextInt();
            Rectangle r1 = new Rectangle(l1,b1);
            Rectangle r2= new Rectangle(l2,b2);
            int area=r1.sameArea(r2);
            if(area==1){
                System.out.println("Both rectangle have same area");
            }
            else{
                System.out.println("Rectangles have different areas");
            }
        } catch (Exception e){
            System.out.println(e);
        }
        finally{
            s.close();
        }
    }
}