public class Square implements Shape {
    float length;

    public Square(float length) {
        this.length = length;
    }


   @Override
    public float area() {
        return (float) (length * length);
    }

    @Override
    public float perimeter() {
        return (float) (4 * length);
    }
}
