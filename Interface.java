interface Vehicle {
  void start();
  void stop();
}

class Bike implements Vehicle {
  public void start() {
    System.out.println("Bike Started");
  }
  public void stop() {
    System.out.println("Bike Stopped");
  }
}

public class Interface {
  public static void main(String[] args) {
    Bike b = new Bike();
    b.start();
    b.stop();
  }
}
