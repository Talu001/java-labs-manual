// Abstract class Shape hn
abstract class Shape {
    abstract double calculateArea();
}

// Circle subclass hn
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Rectangle subclass hn
class Rectangle extends Shape {
    double width, height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return width * height;
    }
}

// Triangle subclass hn
class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}

// Main class to test the program
public class ShapeCalculator {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(5),
            new Rectangle(6, 9),
            new Triangle(4, 4)
        };

        double totalArea = 0;
        for (Shape shape : shapes) {
            System.out.println(shape.calculateArea());
        }

        
    }
}
