public class wrapperClasses {
  int[] arr;
  int object;

  wrapperClasses() {
    arr = new int[4];
    object = 0;
  }

  // A wrapper class is a class which has some additional properties other than
  // ccessing the datatype.String is a wrapper class for character array.
  public void addElement(int element, int index) {
    this.arr[index] = element;
    // if(object==arr.length)
    object++;
  }

  public static void main(String[] args) {
    // String interning
    // String s1 = "laptop";
    // String s2 = "laptop";
    // s2 = "pen";
    // int n=10;
    // Integer m=n;//Autoboxing
    // int o=m;//Unboxing
    // Integer a1 = 83;
    // Integer a2 = 66;
    // Integer a3 = 66;
    // Integer a4 = 127;
    // Integer a5 = 127;
    // Integer a6 = 128;
    // Integer a7 = 128;
    // Integer a8 = -129;
    // Integer a9 = -129;

    // System.out.println(a4 == a5); //Output is true
    // System.out.println(a6 == a7);//output is false
    // System.out.println(a8 == a9);// output is false
    // System.out.println(a8.equals(a9));

  }
}
