// Define the interface with overloaded methods
interface Calculator {
    // Method with one integer parameter
    int calculate(int a);

    // Overloaded method with two integer parameters
    int calculate(int a, int b);

    // Overloaded method with three integer parameters
    int calculate(int a, int b, int c);
}

// Implement the interface in a class
class SimpleCalculator implements Calculator {

    // Implement method with one integer parameter
    @Override
    public int calculate(int a) {
        return a * a; // Example operation: square of the number
    }

    // Implement method with two integer parameters
    @Override
    public int calculate(int a, int b) {
        return a + b; // Example operation: sum of the two numbers
    }

    // Implement method with three integer parameters
    @Override
    public int calculate(int a, int b, int c) {
        return a * b * c; // Example operation: product of the three numbers
    }
}

// Test the implementation
public class interfaceOverloading {
    public static void main(String[] args)   {
        Calculator calc = new SimpleCalculator();

        System.out.println("Square of 5: " + calc.calculate(5)); // Output: 25
        System.out.println("Sum of 3 and 4: " + calc.calculate(3, 4)); // Output: 7
        System.out.println("Product of 2, 3, and 4: " + calc.calculate(2, 3, 4)); // Output: 24
    }
}
