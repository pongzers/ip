public class DukeException extends Exception {
    String error;
    DukeException(DukeExceptionType errorType) {
        super(errorType.toString());
        error = errorType.toString();
    }

    @Override
    public String toString() {
        return error;
    }
}
