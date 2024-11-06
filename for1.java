import java.util.Scanner;

public class for1 {

    int a,b;
    float c,d;


    int sum (int y, int z)
    {
        a=y;
        b=z;
        int i = a-b;
        System.out.println("==========================="+i);
        return i;
    }

    float sum (float g, float h)
    {
        c=g;
        d=h;
        float k = c*d;
        System.out.println("==========================="+k);
        return k;

    }


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("plz enter the number");

        for1 f = new for1();


        int i= s.nextInt();
        int i1= s.nextInt();
        System.out.println("compled");
        f.sum(i, i1);

        float m= s.nextFloat ();
        float m1= s.nextFloat ();
        System.out.println("compled");
        f.sum(m, m1);





        
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
       this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public float getD() {
        return d;
    }

    public void setD(float d) {
        this.d = d;
    }
    
}
