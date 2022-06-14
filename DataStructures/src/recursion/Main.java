package recursion;

public class Main {
  public static void main(String[] args) {

    walk(5);
    System.out.println(fuctorial(2, 7));
    fuctorial(2, 10);
  }

  private static int fuctorial(int base, int expo) {
    if (expo < 1) return 1;
    return base * fuctorial(base, expo - 1);
  }

  private static void walk(int i) {
    //    for (int j = 0; j< i; j++) System.out.println("You took a step");

    if (i < 1) return; // base case
    System.out.println("You took a step");
    walk(i - 1); // recursive case
  }
}
