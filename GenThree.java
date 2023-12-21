public class GenThree {
    public static void main(String[] args) {
        // recieves the range from the user
        int a = Integer.parseInt(args[0]); 
        int b = Integer.parseInt(args[1]); 
        // generates three random integers within the range given
        double num1 = (Math.random() * (b - a)) + a;
        double num2 = (Math.random() * (b - a)) + a;
        double num3 = (Math.random() * (b - a)) + a;
        // generates smallest number from the group
        double min = Math.min(num1, Math.min(num2, num3));
        // prints the numbers generated and the smallest number
        System.out.println((int) num1);
        System.out.println((int) num2);
        System.out.println((int) num3);
        System.out.println("The minimal generated number was " + (int) min);
    }
}