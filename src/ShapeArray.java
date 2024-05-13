public class ShapeArray {
    public static void main(String[] args) {
        Shape[] shape_array = new Shape[3];
        shape_array[0] = new Triangle(3, 4, 5);
        shape_array[1] = new Circle(2);
        shape_array[2] = new Rectangle(3, 4);

        for(Shape shape : shape_array) {
            System.out.println(shape.toString());
        }
    }
}
