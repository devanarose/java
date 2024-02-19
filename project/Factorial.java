import java.io.*;

public class Factorial{
	public static int fact(int n){
		if(n<=0)
			return 1;
		return n*fact(n-1);
	}
	public static void main(String args[]){
		int num;
		System.out.println("DEVANA");
		DataInputStream din;
		din=new DataInputStream(System.in);
		try{
			System.out.print("Enter number: ");
			num=Integer.parseInt(din.readLine());
			System.out.print("Factorial of "+num+" : "+fact(num));	
		}catch(Exception e){
			System.out.println("ERROR "+e);
			}

	}
}
