//threading
import java.io.*;
class Cthread extends Thread {
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

class MThread {
	public static void main(String args[]) {
		Cthread t1,t2;
		t1 = new Cthread(100);
		t2 = new Cthread(150);
		System.out.println("Before thread");
		t1.start();  //its in ready queue for the execution
		System.out.println("Between thread");
		t2.start();
		System.out.println("After thread");
	}
}