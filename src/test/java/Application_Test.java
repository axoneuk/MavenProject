import org.junit.Assert;
import org.junit.Test;

public class Application_Test {

    @Test
    public void test1(){
        System.out.println("running test 1");
    }

    @Test
    public void test2(){
        System.out.println("running test 1");
    }

    @Test
    public void new_test1(){
        Assert.assertFalse(false);
    }

    @Test
    public void new_test2(){
        System.out.println("running test 1");
    }

}
