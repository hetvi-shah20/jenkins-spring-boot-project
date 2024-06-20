package com.example.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class JenkinsTestController {

    @GetMapping("/get-benefits")
    public List<String> getBenefitsOfJenkins(){
       return Arrays.asList("Open source and free","Jenkins saves developers a significant amount of time in the product building process, as the entire process is automated","There is no need to manually perform tests and wait for test results, so this saves a lot of time and ultimately money for the company.");
    }
}
