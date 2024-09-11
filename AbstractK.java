abstract class Car { //to use abstract method I have to make the class abstract also
    public abstract void drive(); //when we use abstract then its responsibility goes to the child class

    public void accident() {
        System.out.println("Already had one!");
    }
}

class Taycan extends Car {   //this class have put fuctionalities into the drive method
    public void drive() {
        System.out.println("Just start and push the throttle!");
    }
}

public class AbstractK {
    public static void main(String args[]) {
        Car obj = new Taycan();  //we can't make object of an abstract class
        obj.drive();
        obj.accident();
    }
}
