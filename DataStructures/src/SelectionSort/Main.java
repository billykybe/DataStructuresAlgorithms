package SelectionSort;

public class Main {
  public static void main(String[] args) {

    int[] nums = {5, 6, 8, 3, 4, 6, 8, 8, 1};
    for (int i : nums) {
      System.out.print(" " + i + " ");
    }

    selectionSort(nums);
    System.out.println();
      for (int i : nums) {
          System.out.print(" " + i + " ");
      }
  }

  private static void selectionSort(int[] nums) {

    for (int i = 0; i < nums.length - 1; i++) {
      int min = i;
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[min] > nums[j]) { //to reverce use <
          min = j;
        }
      }
      int temp = nums[i];
      nums[i]=nums[min];
      nums[min] = temp;

    }
  }
}
