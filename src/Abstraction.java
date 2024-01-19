package src;


abstract class Shape {
    abstract double area();

    void display() {
        System.out.println("this is a shape");
    }
}

class Circle extends Shape {

    private final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    void shapeDetails() {
        System.out.println("This is a Circle with radius : " + radius + " and area : " + area());
    }
}


class Square extends Shape{
    private final double side;

    Square(double side){
        this.side = side;
    }

    double area(){
        return side * side;
    }

    void shapeInfo(){
        System.out.println("This is a square with each side : " + side + " units and area : " + area());
    }

}

public class Abstraction {
    public static void main(String[] args) {
        Circle c = new Circle(4);
        Square s = new Square(4);

        System.out.println(c.area());
        System.out.println(s.area());
    }


}
