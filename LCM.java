import java.util.Scanner;

public class LCM {
  public static void main(string[] args) {
    Scanner sc = new Scanner(System.int);
    System.out.print("Enter first number: ");
    int a = sc.nextInt();
    System.out.print("Enter second number: ");
    int b = sc.nextInt();

    // first find GCD
    int gcd = 1;
    for (int i = 1; i <= a && i <= b; i++) {
      if (a % i  == 0 && b % i == 0) {
        gcd = i;
      }
    }

    // LCM formula: (a * b) / GCD
    int lcm = (a * b) / gcd;
    System.out.println("LCM of " + a + " and " + b + " is " + lcm);
    sc.close();
  }
}
