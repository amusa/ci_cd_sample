package com.sample.ci_cd;

import org.springframework.boot.*; 
import org.springframework.boot.autoconfigure.*; 
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*; 
 
@RestController 
@EnableAutoConfiguration 
public class Example { 
 
    @RequestMapping("/greet") 
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model){ 
        return "Hello "+name+"!"; 
    } 
 
    public static void main(String[] args) throws Exception { 
        SpringApplication.run(Example.class, args); 
    } 
 
} 