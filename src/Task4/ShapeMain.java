package Task4;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShapeMain implements Comparable<ShapeMain> {
    public static void main(String[] args) {
        double side = 3;
        double radius = 1;
        double base = 5;
        double height = 2;
        double width = 4;
        List<ShapeMain> shapes = new ArrayList<>();
        shapes.add(new Circle(radius));
        shapes.add(new Square(side));
        shapes.add(new Triangle(base, height));
        shapes.add(new Rectangle(width, height));

        System.out.println(shapes);
        Collections.sort(shapes);
        System.out.println("After sort: ");
        for (ShapeMain shape : shapes) {
            System.out.println(shape);
        }
    }
    double area;
    void setArea(double d) {
        this.area = d;
    }

    @Override
    public int compareTo(ShapeMain o) {
        if (this.area == o.area) {
            return 0;
        } else if (this.area < o.area) {
            return -1;
        } else {
            return 1;
        }
    }
}