package sessions.enumsExceptions.ozubuzdunException;

public class AgeException extends Exception{
    public AgeException() {
        super("Default message");
    }

    public AgeException(String message) {
        super(message);
    }

}