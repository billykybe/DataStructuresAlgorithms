package Graphs.undirected;

import java.util.ArrayList;

public class Graphs {
    ArrayList<Nodes> nodes;
    int [][] matrix;

    Graphs(int size){
        nodes = new ArrayList<>();
        matrix = new int[size][size];
    }

    public  void  addNode (Nodes nodes){
        this.nodes.add(nodes);


    }

    public  void  addEdge (int src , int dest){
        matrix[src][dest] = 1;


    }
    public  boolean  checkEdge (int src , int dest){
        return matrix[src][dest] == 1;

    }
    public  void  print(){
for (Nodes node : nodes){
      System.out.print("  "+node.data+" ");

}
        System.out.println();

        for (int ints = 0 ; ints < matrix.length; ints++){
            System.out.print(nodes.get(ints).data+" ");

            for (int intints = 0 ; intints < matrix[ints ].length;intints++){

                System.out.print(matrix[ints][intints]+" ");
            }
      System.out.println();
        }




    }




}
