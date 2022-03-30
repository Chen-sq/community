package life.community.communiy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public  String hello(@RequestParam(name="name")String name, Model model){

        //把浏览器传来的值放到model里，才能传到下文去
        model.addAttribute("name",name);
        return "hello";

    }
}
