class Triangle{
    float width,height;
    Triangle(){
        width=0;height=0;
    }
    Triangle(float width,float height){
        this.width=width;
        this.height=height;
    }
    public float getarea(){
        return 0.5f*this.height*this.width;
    }
}
class Cone extends Triangle{
    float r,l;
    Cone(float r,float l){
        this.r=r;
        this.l=l;
    }
    public float getarea(){
        return 3.14f*r*(r+l);
    }
}
class Main {
    public static void main(String[] args) {
        Triangle t= new Cone(88,69);
        System.out.println(t.getarea());
    }
}
