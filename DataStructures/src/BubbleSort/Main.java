package BubbleSort;

public class Main {
  public static void main(String[] args) {
    /*
     * Quadratic time O(n^2)
     * bad for large data
     * */

    int[] numbers = {9, 4, 2, 9, 4, 3, 7, 9};

    for (int i = 0; i < numbers.length; i++) {
      System.out.print(" " + numbers[i] + " ");
    }
    bubbleSort(numbers);
    System.out.println();
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(" " + numbers[i] + " ");
    }
  }

  private static void bubbleSort(int[] numbers) {

    for (int i = 0; i < numbers.length - 1; i++) {
      for (int j = 0; j < numbers.length - i - 1; j++) {
        if (numbers[j] < numbers[j + 1]) { // use > or < to reverse
          int temp = numbers[j];

          numbers[j] = numbers[j + 1];
          numbers[j + 1] = temp;
        }
      }
    }
  }
}
