package controller;

import model.ViewCounter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("viewcounter")
public class CounterController {

    @ModelAttribute("viewcounter")
    public ViewCounter setUpCounter() {
        return new ViewCounter();
    }

    @GetMapping("/")
    public String get(@ModelAttribute("viewcounter") ViewCounter viewCounter) {
        viewCounter.increment();
        return "index";
    }
}
