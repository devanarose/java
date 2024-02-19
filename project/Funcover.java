import java.io.*;
class Person {
	int age;
	String name;
	public void read() {
		DataInputStream din=new DataInputStream(System.in);
		try{
			System.out.println("Enter name and age: ");
			name=din.readLine();
			age=Integer.parseInt(din.readLine());
		}
		catch(Exception e){
			System.out.println(e);
		}
	}	
	public void disp() {
		System.out.println("Name: "+name+" age: "+age);
	}
}
class Teacher extends Person {
	String subject;
	public void read() {
		super.read();
		DataInputStream din=new DataInputStream(System.in);
		try{
			System.out.println("Enter Subject: ");
			subject=din.readLine();	
		}
		catch(Exception e){
			System.out.println(e);
		}
	}	
	public void disp() {
		super.disp();
		System.out.println("Subject: "+subject);
	}
}
public class Funcover{
	public static void main(String args[]) {
		Person p;
		Teacher t;
		p=new Person();
		t=new Teacher();
		p.read();
		t.read();
		p.disp();
		t.disp();
	}
}