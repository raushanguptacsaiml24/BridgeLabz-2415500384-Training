class Circles{
    int radius;

    Circles(int radius){
        this.radius = radius;
    }

    public void area(){
        double area = Math.PI * radius * radius;
        System.out.println(area);
    }

    public void circunfrence(){
        double circunfrence = 2 * Math.PI * radius;
        System.out.println(circunfrence);
    }
}


public class AreaOfCircle {
    public static void main(String[] Args){
        Circles c1 = new Circles(12);
        c1.area();
        c1.circunfrence();
    }
}
