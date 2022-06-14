package Graphs.directed;

public class Main {
  public static void main(String[] args) {
    //      Adjacency list
      /*
      * arraylist of  linked list
      * each linked list has a euniq node at the head
      * rtc o(V)
      * sc O(V + e) */

Graphs graphs = new Graphs();


    graphs.addNode(new Nodes('A'));
    graphs.addNode(new Nodes('B'));
    graphs.addNode(new Nodes('C'));
    graphs.addNode(new Nodes('D'));
    graphs.addNode(new Nodes('E'));

    graphs.addEdge(0,1);
    graphs.addEdge(1,2);
    graphs.addEdge(1,4);
    graphs.addEdge(4,0);
    graphs.addEdge(4,2);
    graphs.addEdge(2,4);
    graphs.addEdge(2,3);

    graphs.text();

  }
}
