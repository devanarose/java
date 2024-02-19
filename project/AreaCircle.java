import java.io.*;
class Area {
	double r,area;
	public void areaofcircle(){
		DataInputStream din;
		din=new DataInputStream(System.in);
		try{
			System.out.print("Enter Radius: ");
			r=Double.parseDouble(din.readLine());
			area=3.14*r*r;
			System.out.print("Area of circle: "+area);	
		}catch(Exception e){
			System.out.println("ERROR "+e);
			}
	}
}

public class AreaCircle{
	public static void main(String args[]){
		System.out.println("DEVANA");
			Area a=new Area();
			a.areaofcircle();
	}
}
