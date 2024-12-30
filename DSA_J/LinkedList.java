package DSA_J;

public class LinkedList {
  class Node {
    int val;
    Node next;
  }

  private Node head;
  private Node tail;
  private int size;

  public void addFirst(int item) {
    Node n = new Node();
    n.val = item;
    if (size == 0) {
      head = n;
      tail = n;
      size++;
    } else {
      n.next = head;
      head = n;
      size++;
    }

  }

  public void addLast(int item) {
    if (size == 0)
      addFirst(item);
    else {
      Node nn = new Node();
      nn.val = item;
      tail.next = nn;
      tail = nn;
      size++;
    }
  }

  // find the address of the kth node
  public Node findK(int k) {
    Node temp = head;
    for (int i = 0; i < k; i++) {
      temp = temp.next;

    }
    return temp;
  }

  // add at a particular index
  public void addAtIndex(int item, int k) {
    if (k == 0)
      addFirst(item);
    else if (size == k)
      addLast(item);
    else {
      Node n = new Node();
      n.val = item;
      Node k_1thNode = findK(k - 1);
      n.next = k_1thNode.next;
      k_1thNode.next = n;
      size++;
    }
  }

  // get the first
  public int getFirst() {
    return head.val;
  }

  // get the last
  public int getLast() {
    return tail.val;
  }

  public int getIndex(int k) {
    if (k == 0)
      return getFirst();
    else if (k == size - 1)
      return getLast();
    else
      return findK(k).val;
  }

  public int removeFirst() {
    int remVal = head.val;
    if (size == 1) {
      head = null;
      tail = null;
    } else {
      Node temp = head;
      head = head.next;
      temp.next = null;

    }
    size--;
    return remVal;
  }

  public int removeLast() {
    if (size == 1) {
      return removeFirst();
    } else {
      int rv = tail.val;
      tail = findK(size - 2);
      tail.next = null;
      size--;
      return rv;
    }
  }

  public int removeKahibhi(int k) {
    if (k == 0) {
      return removeFirst();
    } else if (k == size - 1) {
      return removeLast();
    } else {
      Node temp = findK(k - 1);
      Node ye = findK(k);
      int rv = ye.val;
      temp.next = ye.next;
      ye.next = null;
      size--;
      return rv;

    }

  }

  public void display() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.val + "-->");
      temp = temp.next;
    }
    System.out.println("NULL");
  }

}
