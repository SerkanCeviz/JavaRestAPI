package javacampHMRS.Core.Concretes.Result;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DataResult<T> extends Result{
    private T data;

    public DataResult(T data,boolean isSucces, String message) {
        super(isSucces, message);
        this.data=data;
    }

    public DataResult(T data,boolean isSucces) {
        super(isSucces);
        this.data=data;
    }


}
