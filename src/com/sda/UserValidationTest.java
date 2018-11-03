package com.sda;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class UserValidationTest {

    UserValidator userValidator;

    @Before
    public void setUp(){
        System.out.println("Start test");
        userValidator = new UserValidator();

    }

    @After
    public void tearDown(){
        System.out.println("Jeee!");
    }

    @Test
    public void validateUser(){
        //given
        User karolina = new User("Karolina", "!karolina");
        //when
        UserValidationResult userValidationResult = userValidator.validateUser(karolina);
        //then
        UserValidationResult expectedValidationResult = new UserValidationResult("OK", "OK");
        assertEquals(expectedValidationResult, userValidationResult);

    }
}

//zrobić test sparametryzowany, użyć csvsource albo methodsource
