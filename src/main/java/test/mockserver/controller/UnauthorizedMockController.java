package test.mockserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UnauthorizedMockController {

    @GetMapping("/unauthorized")
    public void unauthorizedMock(){

    }

    @GetMapping("/test")
    public String testMock(){
        return "test";
    }

}
