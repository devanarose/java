import java.io.*;
class Sumdig {
	public int methodsum(int n){
		int sum=0;
		while(n!=0){
			int digit=n%10;
			sum+=digit;
			n=n/10;
		}
		return sum;
	}
}

public class SumDigit{
	public static void main(String args[]){
		System.out.println("DEVANA");
		DataInputStream din;
		int num;
		Sumdig s=new Sumdig();
		din=new DataInputStream(System.in);
		try{
			System.out.print("Enter Number: ");
			num=Integer.parseInt(din.readLine());
			int summ=s.methodsum(num);
			System.out.print("Sum of digits: "+summ);	
		}catch(Exception e){
			System.out.println("ERROR "+e);
			}
	}
}
