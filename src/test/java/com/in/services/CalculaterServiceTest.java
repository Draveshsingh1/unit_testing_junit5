package com.in.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculaterServiceTest {
    @Test
    public void sumTest(){
        int actualResult=CalculaterService.sum(5,5);
        int expectedResult=10;
        Assertions.assertEquals(expectedResult,actualResult,"Test fail");

    }
    @Test
    public void nsumTest(){
        int actualReult=CalculaterService.nSum(1,2,3);
        int excepectedResult=21;
        Assertions.assertEquals(excepectedResult,actualReult , "Test Fail");
    }
}
