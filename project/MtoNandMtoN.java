//display from m to n and m to n
import java.util.*;
import java.io.*;
class mton extends Thread {
	int m,n;
	public mton (int a,int b){
		m=a;
		n=b;
	}
	public void run() {
		int increment = 1 ;
		if(m>n) 
			increment=-1;
		int i=m;
		do {
			System.out.println(i+ "  ");
			i=i+increment;
		}while(i!=n);
		System.out.println(i+ "  ");
	}
}

class MtoNandMtoN {
	public static void main(String args[]) {
		Thread p,q;
		mton t1,t2;
		int m,n;
		System.out.println("Enter m and n ");
		Scanner s=new Scanner(System.in);
		m=s.nextInt();
		n=s.nextInt();
		System.out.println(m+ " TO "+n);
		t1 = new mton(m,n);
		t2 = new mton(n,m);
		
		t1.start();  
		
		t2.start();
		
	}
}