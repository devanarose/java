//import java.io.*;
class Person {
	int age;
	String name;
	public Person() {
		age=0; name="  ";
	}
	public Person(int a,String n) {
		age=a; name=n;
	}
	public void disp() {
		System.out.println("Name: "+name+" age: "+age);
	}
}class Teacher extends Person {
	String subject;
	public Teacher(int a,String n,String s) {
		super(a,n);
		subject=s;
	}
	public void disp() {
		super.disp();
		System.out.println("Subject: "+subject);
	}
}
public class Funcoverconst{
	public static void main(String args[]) {
		Person p=new Person(22,"rose");;
		Teacher t=new Teacher(35,"emmanuel","CS");
		p.disp();
		t.disp();
	}
}