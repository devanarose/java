import java.io.*;
class swap{
	public static void main(String args[]){
		int a,b,t;
		DataInputStream din;
		din=new DataInputStream(System.in);
		try{
			System.out.println("Enter 2 numbers:");
			a=Integer.parseInt(din.readLine());
			b=Integer.parseInt(din.readLine());
			
			System.out.println("Before swapping : a= "+a+", b= "+b);
			t=a;
			a=b;
			b=t;
			System.out.println("Before swapping : a= "+a+", b= "+b);
		}
		catch(Exception e){
			System.out.println("ERROR: "+e);
		}
	}
}
	
