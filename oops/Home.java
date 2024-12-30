package oops;

public class Home {
  public static void main(String[] args) {
    Dog d1 = new Dog("Tuffy", "black", "labrador", "bark", 4, true, 1);
    d1.display();
    System.out.println("----------");
    Dog d2 = new Dog();
    d2.display();
  }
}
