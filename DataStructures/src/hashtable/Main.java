package hashtable;

import java.util.Hashtable;

public class Main {
  public static void main(String[] args) {

    Hashtable<String,String> table = new Hashtable<>();
    table.put("298","Billy");
    table.put("12","Kibet");
    table.put("293","Sandra");
    table.put("392","Yegon");
    table.put("100","Mark");


    for (String key : table.keySet()){
      System.out.println(key.hashCode() %50 +"  "+key+"  "+table.get(key));

    }
  }
}
