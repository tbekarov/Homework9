import org.testng.annotations.*;

public class Vezba2 {

    @BeforeMethod
    public void methodOne(){
        System.out.printf("Method One");
    }

    @BeforeClass
    public void methodTwo(){
        System.out.println("Method Two");
    }

    @AfterMethod
    public void methodThree(){
        System.out.println("Method Three");
    }

    @AfterClass
    public void methodFour(){
        System.out.println("Method Four");
    }

    @Test
    public void methodFive(){
        System.out.println("Method Five");
    }

}
