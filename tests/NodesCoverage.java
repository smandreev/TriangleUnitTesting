import org.testng.Assert;
import org.testng.annotations.Test;

public class NodesCoverage {
    @Test
    public void test1() {
        int[] testArr = {3, 4, 5};
        Triangle testTr = new Triangle();
        Assert.assertEquals("Разносторонний", testTr.TypeOfTriangle(testArr));
    }
}
