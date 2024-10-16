package shop.samdul.greeting.controller;

import java.util.Stack;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import shop.samdul.greeting.model.People;

@Controller
public class AnswerController {

    private Stack<People> nameStack = new Stack<>();
    
    @GetMapping("/answer")
    public String answer(
                @RequestParam(
                    name = "name",
                    required = false,
                    defaultValue = "HI"
                ) String name,
        Model model) {
            People p = new People();
            if(!nameStack.isEmpty()) {
                People pp = nameStack.peek();
                p.setNum(pp.getNum()+1);
            } else {
                p.setNum(1);
            }
            p.setName(name);

            nameStack.push(p);
            model.addAttribute("nameStack", nameStack);

            return "answer";
        }
}
