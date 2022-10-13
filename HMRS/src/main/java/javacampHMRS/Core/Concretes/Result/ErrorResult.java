package javacampHMRS.Core.Concretes.Result;

public class ErrorResult extends Result{
    public ErrorResult(boolean isSucces, String message) {
        super(false, message);
    }

    public ErrorResult(boolean isSucces) {
        super(false);
    }
}
