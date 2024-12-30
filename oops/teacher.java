package oops;

public class teacher {
  String name;
  String subject;
  String department;
  int sec1;
  int gen1;
  Batch b = new Batch();

  public teacher(String name, String subject, String department, int sec, int gen) {
    this.name = name;
    this.subject = subject;
    this.department = department;
    this.sec1 = sec;
    this.gen1 = gen;

  }

  public void display() {
    System.out.println("Teacher's info: ");
    System.out.println(this.name);
    System.out.println(this.subject);
    System.out.println(department);
    System.out.println(b.section[sec1]);
    System.out.println(b.gender[gen1]);
  }

}
