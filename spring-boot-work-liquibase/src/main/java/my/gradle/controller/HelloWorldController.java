package my.gradle.controller;

import my.gradle.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

    @Autowired
    ClientService clientService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String renderHelloWorldView() {
        return "index";
    }

    @RequestMapping("/res")
    @ResponseBody
    public String index() {
        return "dont look :)";
    }

}
