class Shape {
    double dim1, dim2;

    Shape(double d1, double d2) {
        dim1 = d1;
        dim2 = d2;
    }

    double area() {
        System.out.println("Area: ");
        return 1.1;
    }
}

class Rectangle extends Shape {
    Rectangle(double d1, double d2) {
        super(d1, d2);
    }

    double area() {
        System.out.println("Area of rectangle: ");
        return dim1 * dim2;
    }

}

class Triangle extends Shape {
    Triangle(double d1, double d2) {
        super(d1, d2);
    }

    double area() {
        System.out.println("Area of triangle: ");
        return 0.5 * dim1 * dim2;
    }

}

class area {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5.0, 8.0);
        System.out.println(r1.area());
        Triangle t1 = new Triangle(2.0, 6.0);
        System.out.println(t1.area());

    }
}