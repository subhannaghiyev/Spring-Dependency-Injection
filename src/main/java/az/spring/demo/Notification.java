package az.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
@Component("notification")
public class Notification {
    @Autowired
    @Qualifier("email")
    public Message message; //property mesaage dir..
    @Autowired
    public Employee employee;

    //Constructor Injection
//    public Notification(Message message) {
//        this.message = message;
//    }

    //Setter Injection
    public void setMessage(Message message) {
        this.message = message;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }


    public void alert() {
        System.out.println("Notifications......");
        System.out.println(employee);
        message.send();
    }

}
