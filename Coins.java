public class Coins {
    public static void main(String[] args) {
        // recieves the total number of cents from user
        int total = Integer.parseInt(args[0]); 
        int quarters = total / 25; // calculates maximum number of quarter coins
        int cents = total % 25; // calculates the remainder of the total by single cent coins
        // prints representation of total cents using as many quarter coins as possible
        System.out.println("Use " + quarters + " quarters and " + cents + " cents");
    }
}