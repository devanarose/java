import java.io.*;
class numadd{
	int number,sum;
	public void read(){
		DataInputStream din=new DataInputStream(System.in);
		try{
			System.out.println("Enter number: ");
			number=Integer.parseInt(din.readLine());
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	public void disp(){
		System.out.println(number);
	}
	public numadd add(numadd q) {
		numadd temp=new numadd();
		temp.number=number+q.number;
		return temp;
	}
}
public class Addnum {
	public static void main(String args[]) {
		numadd p,q,r;
		p=new numadd();
		q=new numadd();
		p.read();
		q.read();
		r=p.add(q);
		System.out.println("Num1: ");
		p.disp();
		System.out.println("Num2: ");
		q.disp();
		System.out.println("SUM: ");
		r.disp();
	}
}