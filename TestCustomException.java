

public class TestCustomException {
    public void validateAge(int age) throws InvalidVoterException {
        if(age < 18) throw new InvalidVoterException("age is not enough to vote");
        else {
            System.out.println("Age is enough to vote");
        }
    }
    public static void main(String[] args) {
        TestCustomException test = new TestCustomException();
        int age = 16;

        try {
            test.validateAge(age);
        }
        catch(InvalidVoterException e) {
            System.out.println("Found the exception");
            System.out.println("Exception occurred: " + e);
        }
    }
}
