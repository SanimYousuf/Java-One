class A {
    public void show() {
        System.out.println("A in a show");
    }
    public void field() {
        System.out.println("A in a field");
    }
}

class B extends A {
    public void show() {
        System.out.println("B in a show");
    }
}

public class MethodOver {
    public static void main(String args[]) {
        B obj = new B();
        obj.show();
        obj.field();
    }
    //output: B in a show -> Here method show is overriding A & executing method in B
          //A in a field
}
