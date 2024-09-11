class OwnException extends Exception {
    public OwnException(String string) {
        super(string);
    }
}

public class CustomExcep {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j = 10/i;
            if(j==0) 
                throw new OwnException("Don't like zero!");
        }
        catch(OwnException e) {
            j = 10/2; 
            System.out.println("Default solution: " + e);
        }

        System.out.println(j);
    }
    
}
