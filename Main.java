class Student {
    private String name;
    private double grade;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getGrade() {
        return grade;
    }
    public void setGrade(double grade) {
        this.grade = grade;
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("Alice Wonderland");
        student.setGrade(95.5);

        String name = student.getName();
        double grade = student.getGrade();

        System.out.println("Name: "+ name);
        System.out.println("Grade: " + grade);
    }
}
