public class CalculateShape {

    // Is calculate shape dependent on Circle?
    // Is calculate shape dependent on Square?
    // Is calculate shape dependent on Shape?
    
    Shape shape;

    public CalculateShape(Shape shape) {
        this.shape = shape;
    }
    
    public void PrintArea() {
        System.out.println("Area: " + shape.area());
    }
    
    public void PrintPerimeter() {
        System.out.println("Perimeter: " + shape.perimeter());
    }
}
