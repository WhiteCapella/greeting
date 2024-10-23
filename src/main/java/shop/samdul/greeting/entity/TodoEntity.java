package shop.samdul.greeting.entity;

import org.springframework.web.bind.annotation.SessionAttributes;

import lombok.Setter;
import lombok.ToString;
import lombok.Getter;

@Setter
@Getter
@ToString

public class TodoEntity {
    private Integer id;
    private String subject;
    private String body;
    private Boolean completed;
    
}