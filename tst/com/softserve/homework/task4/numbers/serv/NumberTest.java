package com.softserve.homework.task4.numbers.serv;
import org.junit.*;
import com.softserve.homework.task4.numbers.serv.Numbers;

public class NumberTest {
    private static Numbers numbers;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("@BeforeClass setUpBeforeClass()");
        numbers = new Numbers();
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("@AfterClass tearDownAfterClass()");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("\t@Before setUp()");
    }

    @Before
    public void setUp2() throws Exception {
        System.out.println("\t@Before setUp2()");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("\t@After tearDown()");
    }


    }
