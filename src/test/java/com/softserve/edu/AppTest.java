package com.softserve.edu;


import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void testApp() {
        // From Maven
        System.out.println("***surefire.application.password = " + System.getProperty("surefire.application.password"));
        // From OS
        System.out.println("***System.getenv(\"JAVA_HOME\") = " + System.getenv("JAVA_HOME"));
        System.out.println("***System.getenv(\"DEFAULT_PASS\") = " + System.getenv("DEFAULT_PASS"));
        // From Eclipse/Idea
        System.out.println("***System.getenv().MY_IDE = " + System.getenv().get("MY_IDE"));
        //
        Assert.assertEquals(9, 4 + 5);
    }
}
