class Triangle extends Shape {
    private double side_one;
    private double side_two;
    private double side_three;

    public Triangle(double side_one, double side_two, double side_three) {
        this.side_one = side_one;
        this.side_two = side_two;
        this.side_three = side_three;
    }


    @Override
    public double area() {
        double s = (side_one + side_two + side_three) / 2;
        return Math.sqrt(s * (s - side_one) * (s - side_two) * (s - side_three));
    }

    @Override
    public double perimeter() {
        return side_one + side_two + side_three;
    }

    @Override
    public String toString() {
        return "Triangle Area: " + area() + ", Triangle Perimeter: " + perimeter();
    }
}
