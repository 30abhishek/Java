package Twitter_Project;

import Twitter_Project.AddFriend;
import Twitter_Project.Tweet;
import Twitter_Project.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Session getSession(){
        org.hibernate.cfg.Configuration configuration= new org.hibernate.cfg.Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(User.class);
        configuration.addAnnotatedClass(Tweet.class);
        configuration.addAnnotatedClass(AddFriend.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        return session;
    }
}
