package domaine;

public class ServerException extends RuntimeException {
    public ServerException(String message, Throwable cause) {
        super(message, cause);
    }
    public ServerException(String message) {
        super(message);
    }
}
