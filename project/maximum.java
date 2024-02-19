import java.io.*;
class maximum{
	public static void main(String args[]){
		int a,b,max;
		DataInputStream din;
		din=new DataInputStream(System.in);
		try{
			System.out.println("Enter 2 numbers:");
			a=Integer.parseInt(din.readLine());
			b=Integer.parseInt(din.readLine());
			if(a>b){
				if(a>c){
					max=a;			
				}
				else max=c;
			}
			
			System.out.println("Maximum= "+max);
		}
		catch(Exception e){
			System.out.println("ERROR: "+e);
		}
	}
}
	
