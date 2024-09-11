class A {   // if I use final here then noone can extends this class
    public void show() { //if I use final here then noone can override this method
        System.out.println("A is showing");
    }
}
class B extends A {
    public void show() {
        System.out.println("B is showing");
    }
}

public class FinalKey {
    public static void main(String args[]) {
        final double n = 3.1415;
        //double n = 8; //->it will not work
        System.out.println(n);

        B obj = new B();
        obj.show();
    }
    
}
