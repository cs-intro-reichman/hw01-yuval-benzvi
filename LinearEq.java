public class LinearEq {
    public static void main(String[] args) {
        // recieves a,b,c from user
        double a = Double.parseDouble(args[0]); 
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        double x = (c - b) / a; // computes the solution of the equation
        System.out.println(a + " * x + " + b + " = " + c); // prints equation
        System.out.println("X = " + x); // prints computed value
    }
}