package Tree;

public class Main {
  public static void main(String[] args) {
/*
* Tree
* non-linear ds that deals with hierarchical
*
* size = no of nodes
* depth = no of edges
*    - from top parent starts with 0 going down
*
* height = no of edges above the furthest leaf node
*    - from last sibling stat with 0 going up
*
* For Binary tree
* - each node has not more than two children
*
* For Binary search tree
* - the parent node shuld have > val than the child in the left
*  and < than that in the right
*  O(log n) -
* */



    BinarySearchTree binarySearchTree = new BinarySearchTree();

    binarySearchTree.insert(new Node(7));
    binarySearchTree.insert(new Node(2));
    binarySearchTree.insert(new Node(5));
    binarySearchTree.insert(new Node(9));
    binarySearchTree.insert(new Node(3));
    binarySearchTree.insert(new Node(8));
    binarySearchTree.insert(new Node(5));

    binarySearchTree.display();
    System.out.println(binarySearchTree.search(3));
    binarySearchTree.remove(3);
    binarySearchTree.display();
    System.out.println(binarySearchTree.search(3));

  }
}
