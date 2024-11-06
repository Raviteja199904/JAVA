package Java1.Java2;

public class PlainCircle extends Circle {

    public double cx,cy;
    public PlainCircle(double r,double x, double y) 
    {
        super(r);
        this.cx = x;
        this.cy = y;
    }
    public boolean isinside(double x,double y)
     {
        double dx = x-cx,dy=y-cy;
        double distance = Math.sqrt(dx*dx + dy*dy);
        return (distance < r);
    }
}
    
