package InterpolationSearch;

public class Main {
  public static void main(String[] args) {

    /*
    * Improvement to binary search
    * For usiformly dist data*/

    int [] array = {1,2,3,4,5,6,7,8,9,10};
    int target = interpolationSearch(array,8);


  }

  private static int interpolationSearch(int[] array, int target) {

    int high = array.length -1;
    int low = 0;

    while (target >= array[low] && target<=array[high] && low <= high){


      int prob = low + (high-low)*(target- array[low])/(array[high]-array[low]);

      if (array[prob] == target){
        return prob;
      }else if (array[prob] < target){

        low = prob+1;

      }else {

        high = prob -1;
      }
    }

    return -1;
  }
}
