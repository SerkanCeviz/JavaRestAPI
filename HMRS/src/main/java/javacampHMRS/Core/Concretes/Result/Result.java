package javacampHMRS.Core.Concretes.Result;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    private boolean isSucces;
    private String message;

    public Result(boolean isSucces){
        this.isSucces=isSucces;
    }

}
