package shapes;

public class Circle {
    private final double radius;

    private static int numOfCircles = 0;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference(){
        return 2 * Math.PI * radius;
    }

    public static int getNumOfCircles() {
        return Circle.numOfCircles;
    }

    public static void setNumOfCircles(int numOfCircles) {
        Circle.numOfCircles = numOfCircles;
    }
}
