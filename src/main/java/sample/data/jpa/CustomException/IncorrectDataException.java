package sample.data.jpa.CustomException;

public class IncorrectDataException extends Exception {
    public IncorrectDataException(String message){
        super(message);

    }
}
