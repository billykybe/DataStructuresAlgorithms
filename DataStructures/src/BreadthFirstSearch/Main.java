package BreadthFirstSearch;


public class Main {

  public static void main(String[] args) {
    //


      Graphs graphs = new Graphs(6);

      graphs.addNode(new Nodes('A'));
      graphs.addNode(new Nodes('B'));
      graphs.addNode(new Nodes('C'));
      graphs.addNode(new Nodes('D'));
      graphs.addNode(new Nodes('E'));
      graphs.addNode(new Nodes('F'));


      graphs.addEdge(0,1);
      graphs.addEdge(1,2);
      graphs.addEdge(1,4);
      graphs.addEdge(4,0);
      graphs.addEdge(4,2);
      graphs.addEdge(2,4);
      graphs.addEdge(2,3);

      graphs.print();

      graphs.breadthFirtSearch(3);
  }

  /*
  * Diff btn First and Breadth first search
  *
  * Breadth
  * Goes level by level
  * Uses ques
  * better when dest is near to the start
  * Siblings then children
  *
  ** Breadth
   * Goes branch by branch
   * Uses Stack
   * better when dest is far to the start
   * fav games and pazzels
   * children then sibligs
   * */
}
