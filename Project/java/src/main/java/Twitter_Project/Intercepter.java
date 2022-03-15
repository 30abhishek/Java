package Twitter_Project;

import Twitter_Project.Dao.Dao;
import Twitter_Project.CommonException;
import Twitter_Project.User;
import Twitter_Project.Utils.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Intercepter  implements HandlerInterceptor {
    @Autowired
    Dao<User> userDao;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (request.getMethod().equals("GET") && !request.getRequestURI().contains("Form")) {
            if (Utility.validateUser(request.getParameter("email"), request.getParameter("password")))
                throw new CommonException("email or password not found", HttpStatus.BAD_REQUEST);
        }
        return true;
    }
}
