// wap to create abstract class shape = numberofsides()
// provide 3 classes rect,tri,hex s.t each inherits shape
// each contains only method numberofsides() that shows the number of sides in the given geometrical structure

abstract class shape{
    abstract public void numberOfSides();
}
class Triangle extends shape{
    public void numberOfSides(){
        System.out.println("Number of sides for Triangle = 3");
    }
}
class Rectangle extends shape{
    public void numberOfSides(){
        System.out.println("Number of sides for Rectangle = 4");
    }
}
class Hexagon extends shape{
    public void numberOfSides(){
        System.out.println("Number of sides for Hexagon = 6");
    }
}
public class Geometric {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        Triangle t=new Triangle();
        Hexagon h=new Hexagon();
        t.numberOfSides();
        r.numberOfSides();
        h.numberOfSides();   
    }
}
