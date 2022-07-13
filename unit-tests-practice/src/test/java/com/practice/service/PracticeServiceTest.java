package com.practice.service;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PracticeServiceTest {

    @Before
    public void beforeTest() {
        System.out.println("This text is before test");
    }

    @After
    public void afterTest() {
        System.out.println("This text is after test");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("before class");
    }

    PracticeService subject = new PracticeService();

    @Test
    public void getSum_withValidVariables_returnSum() {
        assertEquals(6, subject.getSum(1, 5));
    }

}
