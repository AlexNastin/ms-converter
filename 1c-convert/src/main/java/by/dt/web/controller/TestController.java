package by.dt.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

    @RequestMapping(path = "/test", method = RequestMethod.GET)
    public void test() {
        System.out.println("Test");
    }
}
