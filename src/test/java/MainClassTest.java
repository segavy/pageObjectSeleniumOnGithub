import org.junit.*;

public class MainClassTest {

    @BeforeClass
    public static void beforeClassMethod() {

    }



    @Test
    //@Ignore
    public void method1() {
        Assert.assertTrue(1+1==2);
        Assert.assertFalse("It is TRUE!!!", 2+2 == 3);
        Assert.assertNotEquals("NOT passed!!!! ", "qwe", "qwhge");
        Assert.assertNotNull("qwe");

    }

    @AfterClass
    public static void afterClassMethod() {

    }

}
