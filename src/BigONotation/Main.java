package BigONotation;

public class Main {
  public static void main(String[] args) {
    System.out.println(add(20));
  }

  public static int add(int i) {
    int sum = 0;
    /*     O(n) linear time
    for (int j = 0;j <= i; j++) {
        sum+=i;
    }
    */

    /*        O
             sum = i*(i + 1) /2;
    */

    /*
    *O(1) Constant time
    *Random acces of array elements
    *Inserting at the start of linkedlist
    *
    * O(log n)
    * logarithm time
    * Binary search
    *
    * O(n)
    * Liner time - time and data size matters
    * Looping through elements in an array
    * searching through a linked list
    *
    * O(n Log n)
    * Quasilinear time
    * Marge sort
    * heap sort
    * quick sort
    *
    * O(n^2)
    * Quadratic time
    * Insertion sort
    * selection sort
    * bubble sort
    *
    * O(n!)
    * Factorial time
    * Traveling salesman problem //Todo://
    * */

    return sum;
  }
}
