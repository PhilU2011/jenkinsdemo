package com.javaproject.jenkinsdemo.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/jenkins/")
public class PersonController {



    @RequestMapping(value="get", produces = "application/json", method = RequestMethod.GET)
    public ResponseEntity<String> firstExample (){

        String response ="Hello to the new World!";

        return  new ResponseEntity<String>(response, HttpStatus.ACCEPTED);


    }

}
