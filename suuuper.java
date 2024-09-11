class A {
    public A() {
        //super();  //it's here by default but we can't see it.
        System.out.println("Just A");
    }
    public A(int n) {
        //super();
        System.out.println("Just A " + n);
    }
}
class B extends A {
    public B() {
        //super();
        System.out.println("Just B");
    }
    public B(int n) {
        //super();   //it will call constructor A because it's the parameterized one.
        //this();
        System.out.println("Just B " + n);
    }
}

public class suuuper {
    public static void main(String args[]) {
        B obj = new B(12);
    }
}