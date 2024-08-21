import java.util.Scanner;

public class DollarCentBreakdown {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Define denominations in cents
    int[] dollarValues = { 10000, 5000, 1000, 500, 100, 25, 1 };
    String[] dollarNames = { "$100", "$50", "$10", "$5", "$1", "25c", "1c" };
    int[] counts = new int[dollarValues.length];

    // Prompt user for input
    System.out.print("Enter the amount in dollars and cents: ");
    double amountDollars = sc.nextDouble();
    sc.close();

    // Convert dollars to cents
    int amountCents = (int) Math.round(amountDollars * 100);

    // Calculate the number of each denomination
    for (int i = 0; i < dollarValues.length; i++) {
      counts[i] = amountCents / dollarValues[i];
      amountCents %= dollarValues[i];
    }

    // Print the result
    System.out.println("Currency units to be given:");
    for (int i = 0; i < dollarValues.length; i++) {
      if (counts[i] > 0) { // Only print denominations that are used
        System.out.println(counts[i] + " X " + dollarNames[i]);
      }
    }
  }
}
