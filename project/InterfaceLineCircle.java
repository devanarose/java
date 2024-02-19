import java.io.*;
interface Ishape {
	public void draw();
	public void move();
}
class Line implements Ishape {
	public void draw() {
		System.out.println("Line draw");
	}
	public void move() {
		System.out.println("line move");
	}
}

class circle implements Ishape {
	public void draw() {
		System.out.println("circle draw");
	}
	public void move() {
		System.out.println("circle move");
	}
}
class InterfaceLineCircle {
	public static void main(String args[]) {
		Ishape obj;
		obj = new Line();
		obj.draw();
		obj.move();
		obj= new circle();
		obj.draw();
		obj.move();
	}
}