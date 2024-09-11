interface Computer {  //interface is not a class
    void code();    //by default public, no need to declare
}

class Laptop implements Computer {
    public void code() {
        System.out.println("Cooking language");
    }
}
class Desktop implements Computer {
    public void code() {
        System.out.println("Cooking language: Faster");
    }
}
class Developer {
    public void devApp(Computer lap) {
        lap.code();
    }
}

public class Interface {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer s = new Developer();
        s.devApp(lap);   
    }
}
