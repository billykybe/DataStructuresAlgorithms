package LinearSerach;

public class Main {
  public static void main(String[] args) {
    /*
    * Iterates through a coll one by one
    * runtime complexity : O(n)
    *
    * Disadvantages
    * Slow on large data
    *
    * Advantages
    * Fast for small and mid data sets
    * No need for sort
    * Usefull for data str with no random acces (LinkedList)
    * */

    int [] array = {3,5,8,43,8,6};
    int index = linearSearch(array,3);

    System.out.println(index);
  }

  private static int linearSearch(int[] array, int val) {

    for (int i = 0; i < array.length; i++) {
      if (array[i] == val){
        return i;
      }
      //
    }
    return -1;
  }
}
