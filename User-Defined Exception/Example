class InvalidAgeException extends Exception{
    InvalidAgeException(String msg) {
        System.out.println(msg);
    }
}

public class NewException {
    public static void main(String[] args) {
        try {
            vote(12);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void vote(int age) throws InvalidAgeException {
        if (age <= 18) {
            throw new InvalidAgeException("You cannot vote because you are under 18 ");
        } else {
            System.out.println("You can vote ");
        }
    }
}
