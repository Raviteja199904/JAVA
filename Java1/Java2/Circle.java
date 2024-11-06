package Java1.Java2;

public class Circle {
    public static final double PI = 3.14159;
    public double r;
    public Circle(double r){
        this.r=r;
    }
     public Circle(){
                r=1.0;
    }
     public double circumference()
    {
        return 2 * PI * r;
    }
     public double area()
    {
        return PI * r*r;
                
    }
     //down is my own code which i have written
    public static void main(String[] args){
        Circle cir = new Circle(10.0);
        
        System.out.println(cir.circumference());
        
        System.out.println(cir.area());

    }

}
