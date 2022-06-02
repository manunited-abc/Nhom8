package nlu.nhcnpm.nhom8.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class ExceptionHandlerController {
    @ExceptionHandler(NoHandlerFoundException.class)
    public String exception(NoHandlerFoundException e) {
        e.printStackTrace();
        return  "not-found-page";
    }
}
