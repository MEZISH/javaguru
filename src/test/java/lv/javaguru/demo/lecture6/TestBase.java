package lv.javaguru.demo.lecture6;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class TestBase {
    @BeforeClass
    public static void setupBeforeClass() {
        System.out.println("Running before class");
    }

    @AfterClass
    public static void teardownAfterClass() {
        System.out.println("Running after class");
    }

    @Before
    public void setupBefore() {
        System.out.println("Running before");
    }

    @After
    public void teardownAfter() {
        System.out.println("Running after");
    }
}
