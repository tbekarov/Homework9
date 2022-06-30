import org.testng.annotations.Test;

public class Vezba1 {

    @Test(priority = 1)
    public void methodOne(){
        System.out.printf("Method One");
    }

    @Test(priority = 2)
    public void methodTwo(){
        System.out.println("Method Two");
    }

    @Test(priority = 3, enabled = false)
    public void methodThree(){
        System.out.println("Method Three");
    }

}
