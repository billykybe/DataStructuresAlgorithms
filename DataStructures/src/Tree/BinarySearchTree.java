package Tree;

public class BinarySearchTree {
  Node root;

  public void insert(Node node) {
    root = insertHelper(root, node);
  }

  private Node insertHelper(Node root, Node node) {
    int data = node.data;

    if (root == null) {
      root = node;
      return root;
    } else if (data < root.data) {
      root.left = insertHelper(root.left, node);

    } else {
      root.right = insertHelper(root.right, node);
    }

    return root;
  }

  public void display() {
    displayHelper(root);
  }

  private void displayHelper(Node root) {
    if (root != null) {
      displayHelper(root.right);
      // swap for reverse order
      System.out.println(root.data);
      displayHelper(root.left);
    }
  }

  public boolean search(int data) {
    return searchHelper(root, data);
  }

  private boolean searchHelper(Node root, int data) {

    if (root == null) {
      return false;
    } else if (root.data == data) {
      return true;
    } else if (root.data > data) { //todo: < >
      return searchHelper(root.left, data);
    } else {
      return searchHelper(root.right, data);
    }
  }

  public void remove(int data) {
    if (search(data)) {
      removeHelper(root, data);

    } else {
      System.out.println(data + " not found");
    }
  }

  private Node removeHelper(Node root, int data) {

    if (root == null) {
      return null;
    } else if ( data < root.data) {//todo : keen
       removeHelper(root.left, data);
    } else if (data > root.data) {
       removeHelper(root.right, data);
    } else {
      if (root.right == null && root.left == null) {
        root = null;
      } else if (root.right != null) {

        root.data = succesor(root);
        root.right = removeHelper(root.right, root.data);
      } else {
        root.data = predicessor(root);
        root.left = removeHelper(root.left, root.data);
      }
    }
    return root;
  }

  private int succesor(Node root) {
      //find the least val below the right child of the root node
    root = root.right;
      while (root.left != null){
root = root.left;
    }
      return root.data;
  }

  private int predicessor(Node root) {
      //find the least val below the right child of the root node
root = root.left;
      while (root.right != null){
    root = root.right;
}
      return root.data;
  }
}
