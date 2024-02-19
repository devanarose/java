import java.io.*;
class Sumn {
	public int sumnum(){
		DataInputStream din;
		int n,sum=0,c=2;
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
		return 0;
	}
}

public class SumEven{
	public static void main(String args[]){
		int ss;
		System.out.println("DEVANA");
		Sumn s=new Sumn();
		ss=s.sumnum();
		System.out.print("Sum: "+ss);
	}
}
