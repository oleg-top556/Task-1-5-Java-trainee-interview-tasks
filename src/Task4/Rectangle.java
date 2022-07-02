package Task4;

public class Rectangle extends ShapeMain {

    public Rectangle(double width, double height) {
        this.area = height * width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "area=" + area +
                '}';
    }
}
