import java.io.*;
class Maxi {
	public int Function1(){
		
		return 0;
	}
}

public class Maximumfunction{
	public static void main(String args[]){
		int ss;
		System.out.println("DEVANA");
		Sumn s=new Sumn();
		DataInputStream din;
		int n,;
		din=new DataInputStream(System.in);
		try{
			System.out.print("Enter n: ");
			n=Integer.parseInt(din.readLine());
			for(int i=0;c<=2*n;i++)
			{
				sum=sum+c;
				c+=2;	          
			}
			return sum;	
		}catch(Exception e){
			System.out.println("ERROR "+e);
			}
		ss=s.sumnum();
		System.out.print("Sum: "+ss);
	}
}
