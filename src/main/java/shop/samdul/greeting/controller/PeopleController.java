package shop.samdul.greeting.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PeopleController {
    Stack<String> names = new Stack<>();
    List<NumAndName> numsAndNames = new ArrayList<>();
    Integer num = 1;
    @GetMapping("/people")
    public String people(
        @RequestParam(
            name="name",
            required=false,
            defaultValue = "Jun"
        ) String name,
        
        
        Model model) {
            char[] chars = name.toCharArray();
            if(Character.isLowerCase(chars[0])) {
                chars[0] = Character.toUpperCase(chars[0]);
            }
            name = new String(chars);
        
            numsAndNames.add(new NumAndName(num++, name));
            model.addAttribute("numsAndNames", numsAndNames);    
            return "people";
    }
    public static class NumAndName {
        private int num;
        private String name;

        public NumAndName(int num, String name) {
            this.num = num;
            this.name = name;
        }

        public int getNum() {
            return num;
        }

        public String getName() {
            return name;
        }
    }
}
