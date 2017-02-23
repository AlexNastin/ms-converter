package by.dt.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/convert")
public class TestController {

    @RequestMapping(path = "/test", method = RequestMethod.GET)
    public String test() {
        return "Test Good!";
    }
}
