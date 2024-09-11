public class ExceptionThrow {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j = 10/i;
            System.out.println(j);
            if(j==0) 
                throw new ArithmeticException("Don't like zero mate except 02! ");
        }
        catch(ArithmeticException e) {
            j = 10/2;
            System.out.println("Default solution: "+j +" " + e);
        }
        catch(Exception e) {
            System.out.println("Something went wrong!");
        }
    }
}
