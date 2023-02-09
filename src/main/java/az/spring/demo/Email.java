package az.spring.demo;

import org.springframework.stereotype.Component;

@Component
public class Email implements Message {
    @Override
    public void send(){
        System.out.println("EMAIL was sent successfully!");
    }
}
