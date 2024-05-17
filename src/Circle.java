public class Circle implements Shape {

    float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public float area() {
        // TODO calculate area of the circle and print out the result
        return (float) (Math.PI * radius * radius);
    }

    @Override
    public float perimeter() {
        return (float) (2 * Math.PI * radius);
    }
}
