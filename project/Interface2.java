import java.io.*;
interface I1 {
	public void disp();
	public void print();
}
class c1 implements I1 {
	public void disp() {
		System.out.println("Interface disp");
	}
	public void print() {
		System.out.println("Interface print");
	}
	public void draw() {
		System.out.println("Draw not in interface");
	}
}
class Interface2 {
	public static void main(String args[]) {
		I1 obj=new c1(); //pointing to implemented class
		obj.disp();
		obj.print();
		// obj.draw(); not directly posible
	}
}