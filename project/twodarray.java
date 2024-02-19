import java.io.*;
import java.util.*;
class twodarray{
	public static void main(String args[]){
		System.out.println("DEVANA");
		int a[][],csum[];
		int n,i,j,t,m;
	
		DataInputStream din;
		din=new DataInputStream(System.in);
		try{
			System.out.print("Enter dimentions: ");
			m=Integer.parseInt(din.readLine());
			n=Integer.parseInt(din.readLine());
			a=new int[m][n];
			csum=new int[n];
			System.out.println("Enter "+(m*n)+" elements: ");			// csum = [  |  |  ]
			for(i=0;i<m;i++)
			{
				for(j=0;j<n;j++)
				{
					a[i][j]=Integer.parseInt(din.readLine());
				}
			}

			System.out.println("2D Elements:");
			for(i=0;i<m;i++)
			{
				int rsum=0;
				for(j=0;j<n;j++)
				{
					System.out.print(a[i][j]+"\t");
					rsum+=a[i][j];
					csum[j]+=a[i][j];
				}	
				System.out.println("\t|"+rsum);
			}
			for(i=0;i<n;i++){
				System.out.print(csum[i]+"\t");
			}


	}

		catch(Exception e){
			System.out.println("ERROR :"+e);
		}
	}
}
