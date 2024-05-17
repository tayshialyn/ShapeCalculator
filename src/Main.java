import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // TODO: Modify the following
        // Create a utility function that asks for the user's inputs:
        //   1) Ask for the type of shape: <S> for Square or <C> for Circle
        //   2) Ask for the shape length (or radius, if its a circle)
        //   3) Or, press "Q" to end
        // Finally, depending on the selected shape, print out the area and parameter
        // Hint: The use of a loop is required
        Scanner scanner = new Scanner(System.in);
        String input = "";

        Square square = new Square(1f);
        Circle circle = new Circle(1f);

        while (!input.equals("Q")) {
            System.out.println("Please enter the shape you want to calculate");
            System.out.println("Square [S], Circle [C], or [Q] to Quit");
            input = scanner.nextLine().toUpperCase();
            switch (input) {
                case "S":
                    System.out.println("Please enter the length of square");
                    square.length = scanner.nextFloat();
                    CalculateShape calculateSquare = new CalculateShape(square);
                    calculateSquare.PrintArea();
                    calculateSquare.PrintPerimeter();
                    return;
                case "C":
                    System.out.println("Please enter the length of circle");
                    circle.radius = scanner.nextFloat();
                    CalculateShape calculateCircle = new CalculateShape(circle);
                    calculateCircle.PrintArea();
                    calculateCircle.PrintPerimeter();
                    return;
                case "Q":
                    System.out.println("Changed your mind? Goodbye!");
                    return;
                default:
                    System.out.println("Invalid input. Please enter your 6 numerical digit for your PIN number.");
                    break;
            }
        }

        CalculateShape calculateCircle = new CalculateShape(circle);

        // Calculate Area
        calculateCircle.PrintArea();

        // Calculate Perimeter
        calculateCircle.PrintPerimeter();

//        Circle circle = new Circle(5f);
//        Square square = new Square(5f);
//
//        CalculateShape calculateCircle = new CalculateShape(circle);
//        CalculateShape calculateSquare = new CalculateShape(square);
//
//        // Calculate Area
//        calculateCircle.PrintArea();
//        calculateSquare.PrintArea();
//
//        // Calculate Perimeter
//        calculateCircle.PrintPerimeter();
//        calculateSquare.PrintPerimeter();

    }
}