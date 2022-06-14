package arraylist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        static array
//        int numbers [] = new int[5];
//        int num = 10;
//        for (int i = 0; i < numbers.length; i++) {
//
//            numbers[i] = num;
//            num += 10;
//
//        }
//        System.out.println(numbers[4]);


MyList myList = new MyList(4);
        System.out.println(myList.capacity);

        myList.add("Billy");
        myList.add("Kibet");


        myList.insert(2,"Sammy");
        myList.insert(2,"Yego");

        System.out.println(myList.capacity);
    }
}
