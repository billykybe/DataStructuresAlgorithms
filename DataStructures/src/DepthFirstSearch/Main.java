package DepthFirstSearch;

import Graphs.directed.Nodes;

public class Main {
  public static void main(String[] args) {
/*
* traversing a tree or graph ds
*
* - pick a route
* - keep going to a dead end
* or a previous visited node
* */
Graphs graphs = new Graphs(6);

    graphs.addNode(new DepthFirstSearch.Nodes('A'));
    graphs.addNode(new DepthFirstSearch.Nodes('B'));
    graphs.addNode(new DepthFirstSearch.Nodes('C'));
    graphs.addNode(new DepthFirstSearch.Nodes('D'));
    graphs.addNode(new DepthFirstSearch.Nodes('E'));
    graphs.addNode(new DepthFirstSearch.Nodes('F'));


    graphs.addEdge(0,1);
    graphs.addEdge(1,2);
    graphs.addEdge(1,4);
    graphs.addEdge(4,0);
    graphs.addEdge(4,2);
    graphs.addEdge(2,4);
    graphs.addEdge(2,3);

    graphs.print();

    graphs.depthFirtSearch(3);

  }
}
