package Task4;

public class Triangle extends ShapeMain {

    public Triangle(double base, double height) {
        setArea(base * height / 2);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "area=" + area +
                '}';
    }
}
