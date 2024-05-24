package week07.usergeneration;

public class InvalidUsernameException extends Exception{
    public InvalidUsernameException(String message){
        super(message);
    }

    public InvalidUsernameException(){
        super();
    }
}
