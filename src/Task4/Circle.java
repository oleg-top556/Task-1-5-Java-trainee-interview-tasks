package Task4;

public class Circle extends ShapeMain {

    public Circle(double radius) {
        setArea(Math.pow(radius, 2) * Math.PI);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "area=" + area +
                '}';
    }
}
