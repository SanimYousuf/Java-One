interface Teacher {
    void eat();
    void sleep();
}
interface Student {
    void work();
}
class Human implements Teacher, Student {
    public void eat() {
        System.out.println("Teacher is eating.");
    }
    public void sleep() {
        System.out.println("Teacher is sleeping.");
    }
    public void work() {
        System.out.println("Student is working.");
    }
}

public class RoboHelper {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.eat();
        obj.sleep();
        obj.work();
    }
}
