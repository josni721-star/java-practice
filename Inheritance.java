class Appa {
  void bike() {
    System.out.println("Appa bike vaithirukkar");
  }
}

class Josni extends Appa {
  void laptop() {
    System.out.println("Josni laptop vaithirukka");
  }
}

public class Inheritance {
  public static void main(String[] args) {
    Josni J = new Josni();
    J.bike();
    J.laptop();
  }
}
