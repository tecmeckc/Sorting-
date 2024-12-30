package DSA_J;

public class Queue {
  private int[] arr;
  private int front = 0;
  private int size = 0;

  public Queue() {
    arr = new int[5];
  }

  public Queue(int n) {
    arr = new int[n];
  }

  public int isEmpty() {
    return size = 0;
  }

  public void enqueue(int item) {
    arr[size] = item;
    size++;
  }

  public void enqueueCircular(int item) {
    int idx = (front + size) % arr.length;
    arr[idx] = item;
    size++;
  }

  public int dequeue() {
    int rv = arr[front];
    front++;
    size--;
    return rv;
  }

  public int dequeueCircular() {
    int rv = arr[front];
    front = (front + 1) % arr.length;
    size--;
    return rv;
  }

  public int get() {
    return arr[front];
  }

  public boolean isFull() {
    return size == arr.length;
  }

  public int size() {
    return size;
  }

  public void Display() {
    for (int i = 0; i < size; i++) {
      int idx = (front + i) % arr.length;
      System.out.print(arr[idx] + " ");
    }
    System.out.println();
  }

}
