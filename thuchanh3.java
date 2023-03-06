public class thuchanh3 {
    double radius;

    public thuchanh3(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return Math.PI * radius*radius;
    }
    public void sum(){
        System.out.println("radius: "+ getRadius() +"    Area: " +getArea() );
    }
}
