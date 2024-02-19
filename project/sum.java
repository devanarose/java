import java.io.*;
class sum{
	public static void main(String args[]){
		int a,b;
		DataInputStream din;
		din=new DataInputStream(System.in);
		try{
			System.out.println("Enter 2 numbers:");
			a=Integer.parseInt(din.readLine());
			b=Integer.parseInt(din.readLine());
			System.out.println("Sum of "+a+" and "+b+" is "+(a+b));
		}
		catch(Exception e){
			System.out.println("ERROR: "+e);
		}
	}
}
	
