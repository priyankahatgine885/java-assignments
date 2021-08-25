package other.ebankapp.exception;

public class InSufficientBalanceException extends Exception{
    public InSufficientBalanceException(String message) {
        super(message);
    }
}
