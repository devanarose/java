// Write the definition for a class called Complex that has floating point data members for storing
// real and imaginary parts. Define a function Complex sum(Complex) to add two complex numbers
import java.io.*;
class Complex{
	float r,i;
	public void read(){
		DataInputStream din;
		din=new DataInputStream(System.in);
		try{
			System.out.print("Enter Real and Imaginary part: ");
			r=Float.parseFloat(din.readLine());
			i=Float.parseFloat(din.readLine());
		}catch(Exception e){
			System.out.println("ERROR "+e);
			}
	}
	
	public void display(){
		System.out.println(r+"+ "+i+"i ");
	}
	public Complex add(Complex q){
		Complex t=new Complex();
		t.r=r+q.r;
		t.i=i+q.i;
		return t;
	}
}
class ComplexFloat{   
	public static void main(String args[]){   
		Complex p=new Complex();   
		Complex q=new Complex();	   
		p.read();   
		q.read();   
		System.out.println("Complex numbers: ");   
		p.display();   
		q.display();   
		Complex r=new Complex();
		System.out.println("Addition of Complex numbers: ");
		r=p.add(q);
		r.display();
	}
}
