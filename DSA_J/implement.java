package DSA_J;

public class implement {
  public static void main(String[] args) {
    Queue q1 = new Queue();
    q1.enqueue(1);
    q1.enqueue(2);
    q1.enqueueCircular(3);
    q1.enqueue(4);
    System.out.println(q1.get());
    q1.Display();
    q1.dequeue();
    q1.dequeueCircular();
    q1.Display();
    BinaryTrees t1 = new BinaryTrees();
    t1.Display();
    // System.out.println(t1.findVal());
    // Graph g = new Graph(7);
    // g.addEdge(1, 4, 6);
    // g.addEdge(1, 2, 10);
    // g.addEdge(2, 3, 7);
    // g.addEdge(3, 4, 5);
    // g.addEdge(5, 4, 1);
    // g.addEdge(5, 6, 4);
    // g.addEdge(6, 7, 2);
    // g.addEdge(7, 5, 3);
    // g.display();

  }
}
