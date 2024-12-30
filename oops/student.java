package oops;

public class student {
  String name;
  String course;
  long rollno;
  int sec;
  int gen;
  Batch b = new Batch();

  public student() {
  }

  public student(String name, String course, long rollno, int sec, int gen) {

    this.name = name;
    this.course = course;
    this.rollno = rollno;
    this.sec = sec;
    this.gen = gen;
  }

  public void studentInfo() {
    System.out.println("Student's info: ");
    System.out.println(this.name);
    System.out.println(this.course);
    System.out.println(this.rollno);
    System.out.println(b.section[sec]);
    System.out.println(b.gender[gen]);
  }

}
