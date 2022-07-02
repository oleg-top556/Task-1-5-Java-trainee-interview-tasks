package Task4;

public class Square extends ShapeMain {

    public Square(double side) {
        setArea(side * side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "area=" + area +
                '}';
    }
}
