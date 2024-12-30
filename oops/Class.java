package oops;

public class Class {

  public static void main(String[] args) {
    teacher t1 = new teacher("Malvika", "Chemistry", "CSE", 0, 1);
    t1.display();
    System.out.println("----------");
    student s1 = new student("Khyati Choudhary", "BTECH CSE", 106, 1, 1);
    s1.studentInfo();

  }
}
