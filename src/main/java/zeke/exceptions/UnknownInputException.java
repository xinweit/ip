package zeke.exceptions;

public class UnknownInputException extends ZekeException {

    public UnknownInputException() {
    }

    @Override
    public String getMessage() {
        return "MonkaS! I'm sorry, but I don't know what that means.\n";
    }
}