package shapes;

import util.Input;

public class CircleApp {

    public static void circleCreator(Input in){
        do {
            Circle circle = new Circle(in.getInt("PLease enter the radius of the circle."));
            Circle.setNumOfCircles(Circle.getNumOfCircles() + 1);
            System.out.printf("The area of the circle is %.2f%n", circle.getArea());
            System.out.printf("The circumference of the circle is %.2f%n", circle.getCircumference());
        } while (in.yesNo("Would you like to create another circle? (y/n)"));
        System.out.printf("You created %d circles%n", Circle.getNumOfCircles());
    }

    public static void main(String[] args) {
        Input in = new Input();
        circleCreator(in);

        in.close();
    }
}
