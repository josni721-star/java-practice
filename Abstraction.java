abstract class Animal {
  abstract void sound();

  void sleep() {
    System.out.println("Sleeping...");
  }
}

class Dog extends Animal {
  void sound() {
    System.out.println("Dog say Bow Bow");
  }
}

public class Abstraction {
  public static void main(String[] args) {
    Dog d = new Dog();
    d.sound();
    d.sleep();
  }
}
