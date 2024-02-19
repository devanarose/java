import java.io.*;
class Person {
	int age;
	String name;
	public void readp() {
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
	public void dispp() {
		System.out.println("Name: "+name+" age: "+age);
	}
}
class Teacher extends Person {
	String subject;
	public void readp() {
		DataInputStream din=new DataInputStream(System.in);
		try{
			System.out.println("Enter Subject: ");
			subject=din.readLine();	
		}
		catch(Exception e){
			System.out.println(e);
		}
	}	
	public void dispt() {
		System.out.println("Subject: "+subject);
	}
}
public class Inher1{
	public static void main(String args[]) {
		Person p;
		Teacher t;
		p=new Person();
		t=new Teacher();
		p.readp();
		t.readp();
		p.dispp();
		t.dispt();
	}
}