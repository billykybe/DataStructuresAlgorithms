package BreadthFirstSearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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
    public void breadthFirtSearch(int src){
        Queue<Integer> queue = new LinkedList<>();
        boolean visited [] = new boolean[matrix.length];

        queue.offer(src);
        visited[src] = true;

        while (queue.size() != 0){
src = queue.poll();
      System.out.println(nodes.get(src).data+" = is visited");

      for (int i = 0 ; i < matrix[src].length;i++){
          if (matrix[src][i] == 1 && !visited[i]){
              queue.offer(i);
              visited[i]=true;
          }

      }
        }


    }



}
