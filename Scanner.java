import java.util.Scanner;

public class Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        System.out.println("Using nextInt(): " + num);

        sc.close();
    }
}