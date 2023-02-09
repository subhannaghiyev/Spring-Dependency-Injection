package az.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

        Notification notification = applicationContext.getBean("notification", Notification.class);

        notification.alert();
    }
}
