package DSA_J;

public class BST {
  class Node {
    int val;
    Node left;
    Node right;
  }

  private Node root;

  public BST(int[] arr) {
    root = createBST(arr, 0, arr.length - 1);
  }

  private Node createBST(int[] arr, int low, int high) {
    if (low > high)
      return null;
    int mid = (low + high) / 2;
    Node nn = new Node();
    nn.val = arr[mid];
    nn.left = createBST(arr, low, mid - 1);
    nn.right = createBST(arr, mid + 1, high);
    return nn;
  }

  public void Display() {

  }
}
