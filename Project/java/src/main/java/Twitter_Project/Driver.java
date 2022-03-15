package Twitter_Project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Driver {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Driver.class,args);
    }
}
