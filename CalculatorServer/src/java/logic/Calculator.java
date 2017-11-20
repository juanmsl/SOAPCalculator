package logic;

public class  Calculator {
    
    public static double add(double a, double b) {
        return a + b;
    }
    
    public static double multiply(double a, double b) {
        return a * b;
    }
    
    public static double minus(double a, double b) {
        return a - b;
    }
    
    public static double divide(double numerator, double denominator) {
        if(denominator == 0) {
            throw new IllegalArgumentException("Cannot divide by 0");
        }
        return numerator / denominator;
    }
}
