package cn.mm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author mm工作室
 * @version 1.0
 * @date 2022/6/29 7:29
 */
@Controller
public class HelloController {

    @RequestMapping("/Hello")
    public String login(String name){
        System.out.println("hello:"+name);
        return "redirect:index.jsp";
    }
}
