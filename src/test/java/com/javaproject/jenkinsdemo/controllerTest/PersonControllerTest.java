package com.javaproject.jenkinsdemo.controllerTest;

import com.javaproject.jenkinsdemo.controller.PersonController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class PersonControllerTest {


    @Mock
    private PersonController controller;

    @Test
    public void giveNumber_whenGettingNumber_thenReceiveMessage(){

       String expected = "Hello to the new World! 1";

        Assertions.assertEquals(expected,"Hello to the new World! 1");



    }

}
