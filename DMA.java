import java.util.ArrayList;
import java.util.Collections;

public class DMA {
  // Dynamic memory allocation
  // ArrayList is a wrapper class
  public static void main(String[] args) {
    // Syntax:Arraylist<wc>name=new ArrayList<>() A wrapper class has
    // first(name=Name of the array)
    // character as capital
    // Add:name.add(value)
    // Access:name.get(index)
    // Removing an element:name.remove(index)
    // Set an element to an index:name.set(index,value)
    // display the array:Simply print the array:System.out.print(name)
    // Sort:Collections.sort(name)
    ArrayList<Integer> arr = new ArrayList<>();
    // System.out.println(arr.size());
    arr.add(130);
    arr.add(100);
    arr.add(10000);
    arr.add(1000);
    arr.add(10);
    arr.remove(2);
    arr.set(3, 122);
    Collections.sort(arr);
    System.out.println(arr);

  }
}
