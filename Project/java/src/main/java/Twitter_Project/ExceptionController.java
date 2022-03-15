package Twitter_Project;

import Assignments.TweeterProject.Utils.Utility;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler(value = CommonException.class)
    public ModelAndView handleError(CommonException ex){
        return Utility.errorMessageModelAndView(ex.getMessage());
    }
}
