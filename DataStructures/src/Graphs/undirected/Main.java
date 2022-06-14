package Graphs.undirected;

public class Main {
  public static void main(String[] args) {

//      Adjacency graph

Graphs graphs = new Graphs(5);

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


    graphs.print();

    System.out.println(    graphs.checkEdge(4,1)
    );
  }
}
