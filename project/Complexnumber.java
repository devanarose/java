import java.io.*;
class Complex{
	int r,i;
	public void read(){
		DataInputStream din;
		din=new DataInputStream(System.in);
		try{
			System.out.print("Enter Real and Imaginary part: ");
			r=Integer.parseInt(din.readLine());
			i=Integer.parseInt(din.readLine());
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

	public Complex mult(Complex q){
		Complex t=new Complex();
		t.r=r*q.r-i*q.i;
		t.i=r*q.i+i*q.r;
		return t;
	}
}
public class Complexnumber{   
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
		System.out.println("Multiplication of Complex numbers: ");
		r=p.mult(q);
		r.display();
	
	}
}
