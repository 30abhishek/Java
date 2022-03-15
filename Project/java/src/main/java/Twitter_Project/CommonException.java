package Twitter_Project;

import org.springframework.http.HttpStatus;

public class CommonException extends RuntimeException {
    private HttpStatus httpStatus;

    public CommonException(String message,HttpStatus httpStatus){
        super(message);
        this.httpStatus=httpStatus;
    }
}
