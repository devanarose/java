import java.util.Scanner;

interface Shape{
    public float  area();
}
class Rectangle implements Shape {
    float length,breadth;
    public Rectangle(float length,float breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public float area(){
        return length*breadth;
    }
}
class Circle  implements Shape {
   float radius;
   public Circle(float radius) {
        this.radius=radius;
   }
   public float area() {
        return 3.14f * radius * radius;
   }
}
class Trapeziod implements Shape{
    float a,b,h;
    public Trapeziod(float a,float b,float h){
        this.a=a;
        this.b=b;
        this.h=h;
    }
    public float area(){
        return (0.5f*(a+b)*h);
    }
}
class Triangle implements Shape{
    float  base,height;
    public  Triangle(float base,float height){
        this.base=base;
        this.height=height;
    }
    public  float area(){
        return  0.5f*base*height;
    }
}
public class Areashape {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the type of shape:");
        System.out.println("\n1.Circle\n2.Trapeziod\n3.Rectangle\n4.Triangle\n5.Exit\n\nEnter choice");
        int n=s.nextInt();
        try{
            switch(n){
                case 1: 
                    System.out.print("Enter the radius: ");
                    float r=s.nextFloat();
                    Shape sh=new Circle(r);
                    System.out.println("Area is "+sh.area());
                    break;
                case 2:
                    System.out.print("Enter length of base1, base2 and hieght: ");
                    float b1=s.nextFloat();
                    float b2=s.nextFloat();
                    float h=s.nextFloat();
                    Shape sha=new Trapeziod(b1,b2,h);
                    System.out.println( "Area of Trapeziod: "+sha.area());
                    break;
                case 3:
                    System.out.print("Enter length and breadth ");
                    float l=s.nextFloat();
                    float b=s.nextFloat();
                    Shape shap=new Rectangle(l,b);
                    System.out.println( "Area of Rectangle: "+shap.area());
                    break;
                case 4:
                    System.out.print("Enter base and hieght ");
                    float base=s.nextFloat();
                    float height=s.nextFloat();
                    Shape shapee=new Triangle(base,height);
                    System.out.println( "Area of Triangle: "+shapee.area());
                    break;
                default : throw new Exception("Invalid input");
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
