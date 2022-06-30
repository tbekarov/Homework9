import org.testng.annotations.Test;

public class Vezba3 {

    @Test
    public void methodOne(){
        System.out.println("Method One");
    }

    @Test(dependsOnMethods = {"methodOne"})
    public void methodTwo(){
        System.out.println("Method Two");
    }

    @Test(dependsOnMethods = {"methodTwo"})
    public void methodThree(){
        System.out.println("Method Three");
    }

    @Test(dependsOnMethods = {"methodThree"},alwaysRun = true)
    public void methodFour(){
        System.out.println("Method Four");
    }

}
