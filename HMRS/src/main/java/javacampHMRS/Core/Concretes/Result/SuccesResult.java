package javacampHMRS.Core.Concretes.Result;

public class SuccesResult extends Result{
    public SuccesResult(boolean isSucces, String message) {
        super(true, message);
    }

    public SuccesResult(boolean isSucces) {
        super(true);
    }
}
