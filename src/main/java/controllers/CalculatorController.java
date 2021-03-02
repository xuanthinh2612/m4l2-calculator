package controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")
public class CalculatorController {

    @GetMapping("/calculator")
    public ModelAndView add(@RequestParam Integer firstNum, Integer secondNum ,String calculator){
        ModelAndView modelAndView = new ModelAndView("calculator");
        int result = 0;
        switch (calculator){
            case "add":
                result = firstNum+secondNum;
                modelAndView.addObject("result",result);
                break;
            case "sub":
                result = firstNum-secondNum;
                modelAndView.addObject("result",result);
                break;
            case "mul":
                result = firstNum*secondNum;
                modelAndView.addObject("result",result);
                break;
            case "div":
                result = firstNum/secondNum;
                modelAndView.addObject("result",result);
                break;
        }

        return modelAndView;
    }
}
