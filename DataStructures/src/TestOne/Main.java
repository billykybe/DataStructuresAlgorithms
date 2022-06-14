package TestOne;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {


      ArrayList<Integer> arrayList = new ArrayList<>();
      LinkedList<Integer> linkedList = new LinkedList<>();

      long startTime,endTime,elapsedTime;

    for (int i = 0; i   < 1000000; i++){
      arrayList.add(i);
      linkedList.add(i);
    }
//===========LinkedList

    startTime = System.nanoTime();
//    dosomthin

//      linkedList.get(0);
//      linkedList.get(999999);
      linkedList.remove(0);


      endTime = System.nanoTime();

      elapsedTime = endTime - startTime;
    System.out.println("Linked List : "+elapsedTime+" ns");

      //===========Arraylist
      startTime = System.nanoTime();
//    dosomthin

//      arrayList.get(0);
//      arrayList.get(999999);
      arrayList.remove(0);
      endTime = System.nanoTime();

      elapsedTime = endTime - startTime;
      System.out.println("Array List : "+elapsedTime+" ns");

  }
}
