package shapes;

public class Square extends Quadrilateral{

    public Square(int side) {
        super(side, side);
    }

    @Override
    void setLength(int length) {
        this.length = length;
        this.width = length;
    }

    @Override
    void setWidth(int width) {
        this.length = width;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public double getArea() {
        return (int) Math.pow(length, 2);
    }
}
