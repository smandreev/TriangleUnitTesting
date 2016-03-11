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
        int[] testArr = {3, 4, 5, 6};
        Triangle testTr = new Triangle();
        Assert.assertTrue("Разносторонний".equals(testTr.TypeOfTriangle(testArr)));
    }


}
