// wap to create abstract class shape = numberofsides()
// provide 3 classes rect,tri,hex s.t each inherits shape
// each contains only method numberofsides() that shows the number of sides in the given geometrical structure
import java.util.*;
abstract class shape{
    abstract public void numberOfSides(int side);
}
class Triangle extends shape{
    public void numberOfSides(int side){
        System.out.println("Number of sides for Triangle = "+side);
    }
}
class Rectangle extends shape{
    public void numberOfSides(int side){
        System.out.println("Number of sides for Rectangle = "+side);
    }
}
class Hexagon extends shape{
    public void numberOfSides(int side){
        System.out.println("Number of sides for Hexagon = "+side);
    }
}
public class Geometric2 {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        Triangle t=new Triangle();
        Hexagon h=new Hexagon();
        Scanner s=new Scanner(System.in);
        try{
            System.out.println("\n1.Triangle\n2.Rectangle\n3.Hexagon\n4.exit\nEnter choice:");
            int n=s.nextInt();
            switch(n){
                case 1: System.out.println("Enter side for Triangle: ");
                        int side=s.nextInt();
                        t.numberOfSides(side);
                        break;
                case 2: System.out.println("Enter side for Rectangle: ");
                        int sidee=s.nextInt();
                        r.numberOfSides(sidee);
                        break;
                case 3: System.out.println("Enter side for Hexagon: ");
                        int sideee=s.nextInt();
                        h.numberOfSides(sideee);
                        break;
                default: System.out.println("invalid option");
            }
        }catch(Exception e) {
            System.out.println(e);
        }  
        finally{
            s.close();
        }
    }
}
