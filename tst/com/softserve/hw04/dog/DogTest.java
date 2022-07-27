package com.softserve.hw04.dog;

import org.junit.*;

public class DogTest {

    @BeforeClass
    public static void beforeClass() throws Exception {
        System.out.println("method beforeClass() finished");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("method setUp() finished");
    }

    @Test
    public void name() {
        System.out.println("method name() finished");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("method tearDown() finished");
    }

    @AfterClass
    public static void afterClass() throws Exception {
        System.out.println("method afterClass() finished");
    }
}
