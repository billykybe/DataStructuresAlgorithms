package MergeSort;

public class Main {
  public static void main(String[] args) {
//todo://Redo this ,cant find the bug
    /*
     * Complex  O(n log n)
     * nned a helper method
     * */
    int[] nums = {9, 3, 2, 7, 8, 1, 2};
    int[] num2 = mergeSort(nums);
    for (int i = 0;i<=nums.length - 1;i++) {
      System.out.print(num2[i]+" ");
    }
  }

  private static int[] mergeSort(int[] nums) {
    int length = nums.length;
    if (length<=1) return nums;
    int middle = length / 2;
    int[] leftAr = new int[middle];
    int[] rightAr = new int[length - middle];

    int i = 0; // left Ar
    int j = 0; // right
    for (; i < length; i++) {
      if (i < middle) {
        leftAr[i] = nums[i];
      } else {
        rightAr[j] = nums[i];
        j++;
      }
    }
    mergeSort(leftAr);
    mergeSort(rightAr);
    merge(leftAr, rightAr, nums);
    return nums;
  }

  //  helper
  private static void merge(int[] leftAr, int[] rightAr, int[] ar) {

    int leftSize = leftAr.length;
    int rightSize = ar.length - leftSize;
    int i = 0;
    int l = 0;
    int r = 0;

    while (l < leftSize && r < rightSize){
      if (leftAr[l] < rightAr[r]){
        ar[i] = leftAr[l];
        i++;
                l++;
      }
      else {
        ar[i] = rightAr[r];

        i++;
        r++;
      }
      while (l<leftSize){
        ar[i] = leftAr[l];
        i++;
        l++;
      }
      while (r<rightSize){
        ar[i] = rightAr[r];
        i++;
        r++;
      }
    }
  }
}
