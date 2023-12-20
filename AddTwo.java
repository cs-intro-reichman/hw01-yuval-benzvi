public class AddTwo {
    public static void main(String[] args) {
        // recieves two integers from the user
        int a = Integer.parseInt(args[0]); 
        int b = Integer.parseInt(args[1]); 
        // prints the sum of the integers
        System.out.println(a + " + " + b + " = " + (a + b));
    }
}