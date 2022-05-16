package linkedlistt;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.push("Billy");
        linkedList.push("Kibet");
        linkedList.push("Xynzy");
        linkedList.push("Zeddy");

        linkedList.pop();

        System.out.println(linkedList.contains("Kibet"));
        System.out.println(linkedList);
linkedList.add(2,"Added");

        System.out.println(linkedList.indexOf("Added"));
        linkedList.addLast("Last");
        linkedList.addFirst("first");
        System.out.println(linkedList);




    }
}
