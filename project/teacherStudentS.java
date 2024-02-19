 import java.util.*; 
 class Persons { 
    int age; String name; 
    public Persons() { 
        age=0; name=" "; 
    } 
    public Persons(int a,String n) {
         age=a; name=n; }
          public void disp() {
             System.out.println("Name: "+name+" age: "+age); 
            } 
} 
class Students extends Persons { 
    int totalmark;
     public Students(int a,String n,int t) {
        super(a,n);
        totalmark=t; 
    } 
    public void disp() { 
        super.disp(); 
        System.out.println("Total mark: "+totalmark); } 
} 
class Teachers extends Persons { 
    String subject; 
    public Teachers(int a,String n,String s) { 
        super(a,n); 
        subject=s; 
    } 
    public void disp() { 
        super.disp(); 
        System.out.println("Subject: "+subject); }
} 

public class teacherStudentS{ 
    public static void main(String args[]) { 
        Scanner s=new Scanner(System.in); 
        int ch,age; String name; 
        try{ 
            System.out.println("MENU\n----\n1.STUDENT DETAILS\n2.TEACHER DETAILS\n3.EXIT\nENTER CHOICE: \n"); 
            ch=s.nextInt(); 
            switch(ch){ 
                case 1: System.out.println("Enter name and age: "); 
                        name=s.nextLine(); 
                        age=s.nextInt(); 
                        System.out.println("Enter total marks: "); 
                        int total_marks=s.nextInt(); 
                        Students stud=new Students(age,name,total_marks); 
                        stud.disp(); 
                        break;
                case 2: System.out.println("Enter name and age: "); 
                        name=s.nextLine(); 
                        age=7; 
                        System.out.println("Enter subject: "); 
                        String sub=s.nextLine(); 
                        Teachers t=new Teachers(age,name,sub); 
                        t.disp(); 
                        break; 
                default: System.out.println("Invalid choice."); 
            }
        } 
        catch(Exception e){ 
            System.out.println(e); 
        } 
        finally{ 
            s.close(); 
        } 
    } 
}