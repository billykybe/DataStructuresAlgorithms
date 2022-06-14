package Graphs.directed;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graphs {
    ArrayList<LinkedList<Nodes>> adList;

    Graphs()
    {
adList = new ArrayList<>();

    }

    public  void  addNode(Nodes node){
        LinkedList<Nodes> currentlist = new LinkedList<>();
        currentlist.add(node);
        adList.add(currentlist);

    }
    public  void  addEdge(int src,int dest){
       LinkedList<Nodes> currentList = adList.get(src);
       Nodes destNode  = adList.get(dest).get(0);
       currentList.add(destNode);


    }
    public  boolean  checkEdge(int src, int dest){

        LinkedList<Nodes> currentList = adList.get(src);
        Nodes nodes = adList.get(dest).get(0);

        for (Nodes node : currentList){
            return node == nodes;
        }

return  false;


    }
    public void  text()
    {
        for (LinkedList<Nodes> currentList : adList){
            for (Nodes nodes : currentList){
        System.out.print(nodes.data+" -> ");
            }
            System.out.println();
        }

    }

}
