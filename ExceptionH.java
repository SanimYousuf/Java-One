public class ExceptionH {
    public static void main(String[] args) {
        int i = 3;
        int j = 0;
        int nums[] = new int[5];
        String str = null;

        try {
            j = 10/i;
            System.out.println(j);
            System.out.println(nums[4]);
            System.out.println(str.length());
        }
        catch(ArithmeticException e) {
            System.out.println("Something went wrong! Can't divide by zero! ");
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Index limit crossed! ");
        }
        catch(Exception e) {
            System.out.println("Something went wrong! "+e);
        }
        System.out.println("Oohh Yeaah!");
    }
}
