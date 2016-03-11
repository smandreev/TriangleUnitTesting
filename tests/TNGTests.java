import org.testng.Assert;
import org.testng.annotations.Test;

//import org.junit.Assert;
//import org.junit.Test;

/**
 * Created by Сергей on 05.03.2015.
 */
public class TNGTests {

    @Test
    public void test1() {
        int[] testArr = {3, 4, 5};
        Triangle testTr = new Triangle();
        Assert.assertTrue("Разносторонний".equals(testTr.TypeOfTriangle(testArr)));
    }

    @Test
    public void test2() {
        int[] testArr = {2, 4, 4};
        Triangle testTr = new Triangle();
        Assert.assertTrue("Равнобедренный".equals(testTr.TypeOfTriangle(testArr)));
    }

    @Test
    public void test3() {
        int[] testArr = {3, 3, 3};
        Triangle testTr = new Triangle();
        Assert.assertTrue("Равносторонний".equals(testTr.TypeOfTriangle(testArr)));
    }

    @Test
    public void test4() {
        int[] testArr = {1, -1, 1};
        Triangle testTr = new Triangle();
        Assert.assertFalse("Разносторонний".equals(testTr.TypeOfTriangle(testArr)));
    }

}
