interface A {
    int age = 22;
    String area = "Dhaka";
    void show();
    void config();
}
interface B {
    void run();
}

interface D extends B {

}

class C implements A,D {
    public void show() {
        System.out.println("Showing shit");
    }
    public void config() {
        System.out.println("Worst possible config");
    }
    public void run() {
        System.out.println("Running is better");
    }
}

public class Interface2 {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
        obj.config();
        obj.run();

        System.out.println(C.area + " " + C.age);
    }
}
