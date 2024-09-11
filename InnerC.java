class A {
    int age;

    public void show() {
        System.out.println("Something is showing.");
    }
    class B {
        public void config() {
            System.out.println("Nothing special here.");
        }
    }
}

public class InnerC {
    public static void main(String args[]) {
        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B();  //A.B -> because B belongs to A and access B we need object of A
        obj1.config();

    
    }
}
