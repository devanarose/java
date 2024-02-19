//threading
import java.io.*;
class Cthread implements Runnable {
	int n;
	public Cthread(int a) {
		n = a;
	}
	public void run() {
		int i;
		for(i=1;i<n;i++) {
			System.out.print("\ti = "+i);
		}
	}
}

class MThreadI {
	public static void main(String args[]) {
		Thread p,q;
		Cthread t1,t2;
		t1 = new Cthread(100);
		t2 = new Cthread(150);
		p= new Thread(t1);
		q= new Thread(t2);
		System.out.println("Before thread");
		p.start();  
		System.out.println("Between thread");
		q.start();
		System.out.println("After thread");
	}
}