package InsertionSort;

public class Main {
  public static void main(String[] args) {

    int[] numbers = {8, 4, 2, 1, 6, 9, 3};
    for (int i : numbers) {
      System.out.print(i + " ");
    }

    insertionSort(numbers);
    System.out.println();
    for (int i : numbers) {

      System.out.print(i + " ");
    }
  }

  private static void insertionSort(int[] numbers) {
    /*
     * Time complexity O(n^2)
     * */
    for (int i = 1; i < numbers.length; i++) {
      int temp = numbers[i];
      int j = i - 1; // be keen here next time
      while (j >= 0 && numbers[j] > temp) {
        numbers[j + 1] = numbers[j];
        j--;
      }
      numbers[j + 1] = temp;
    }
  }
}
