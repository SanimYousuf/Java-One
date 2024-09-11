abstract class Flower {
    public abstract void petal();

    public void color() {
        
        System.out.println("The color jasmine is a pale tint of yellow.");
        System.out.println("Petals of Jasmine moisturize our skin.");
    }
}

class Jasmine extends Flower {
    public void petal() {
        System.out.println("Jasmine petals are edible.");
    }
}

public class Petal {
    public static void main(String[] args) {
        Jasmine obj = new Jasmine();
        obj.petal();
        obj.color();
    }
}
