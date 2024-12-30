package oops;

public class Dog extends Animal {
  String name;
  String color;
  String breed;
  String voice;

  // default constructor
  public Dog() {
  }

  public Dog(String name, String color, String breed, String voice, int legs, boolean tail, int food) {
    this.name = name;
    this.color = color;
    this.breed = breed;
    this.voice = voice;
    this.legs = legs;
    this.tail = tail;
    this.food = food;

  }

  void display() {
    System.out.println(this.name);
    System.out.println(this.color);
    System.out.println(this.breed);
    System.out.println(this.voice);
    System.out.println(this.legs);
    System.out.println(this.tail);
    System.out.println(this.food);
    System.out.println(this.fhh.foods[food]);

  }
}
