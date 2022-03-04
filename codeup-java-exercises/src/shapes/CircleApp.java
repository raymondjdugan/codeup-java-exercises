package shapes;

import util.Input;

public class CircleApp {
    static Input in = new Input();
    public static void circleCreator(){
        int numOfCircles = 0;
        boolean creatingCircles = true;
        do {
            Circle circle = new Circle(in.getInt("PLease enter the radius of the circle."));
            numOfCircles++;
            System.out.printf("The area of the circle is %.2f%n", circle.getArea());
            System.out.printf("The circumference of the circle is %.2f%n", circle.getCircumference());
        } while (in.yesNo("Would you like to create another circle? (y/n)"));
        System.out.printf("You created %d circles%n", numOfCircles);
    }

    public static void main(String[] args) {
        circleCreator();
    }
}
