public class Triangle {
    public static void main(String[] args) {
        // recieves triangle side lengths from user
        int a = Integer.parseInt(args[0]); 
        int b = Integer.parseInt(args[1]); 
        int c = Integer.parseInt(args[2]); 
        // calculates sum of every two sides
        int sum1 = a + b; 
        int sum2 = a + c;
        int sum3 = b + c;
        boolean result = (sum1 > c) && (sum2 > b) && (sum3 > a); // checks if every sum is greater than the remaining side
        System.out.println(a + ", " + b + ", " + c + ": " + result); // prints the sides of the triangle and the result
    }
}