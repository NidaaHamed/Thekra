package com.example.Thekra;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String welcomePage(){
        return "Welcome";
    }
    @GetMapping("/admin")
    public String adminPage(){
        return "Welcome Admin";
    }
    @GetMapping("/teacher")
    public String teacherPage(){
        return "Welcome Teacher";
    }
    @GetMapping("/student")
    public String studentPage(){
        return "Welcome Student";
    }


}
