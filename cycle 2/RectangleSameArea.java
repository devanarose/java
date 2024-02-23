// Write a main function to create two rectangle objects and display its area and perimeter. Check
// whether the two Rectangles have the same area and print a message indicating the result. (Use
// the concept of this pointer too)
class Rectangle{
    int l,b;
    public Rectangle(){
        l=0;b=0;
    }
    public Rectangle(int l,int b){
        this.l = l;
        this.b=b;
    }
    void showArea(Rectangle r1){
        if(this.l*this.b==r1.l*r1.b)
            System.out.println("The two rectangles have the same area.");
        else
        System.out.println("The two rectangles do not have the same area.");
    }
}
public class RectangleSameArea {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2,4);
        Rectangle r2 = new Rectangle(2,4);
        r1.showArea(r2);

    }
}
