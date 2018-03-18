import org.testng.Assert;
import org.testng.annotations.Test;

public class BranchesCoverage {
    @Test
    public void test1() {
        int[] testArr = {3, 4, 5};
        Triangle testTr = new Triangle();
        Assert.assertEquals("Разносторонний", testTr.TypeOfTriangle(testArr));
    }

    @Test
    public void test2() {
        int[] testArr = {2, 4, 4};
        Triangle testTr = new Triangle();
        Assert.assertEquals("Равнобедренный", testTr.TypeOfTriangle(testArr));
    }

    @Test
    public void test3() {
        int[] testArr = {3, 3, 3};
        Triangle testTr = new Triangle();
        Assert.assertEquals("Равносторонний", testTr.TypeOfTriangle(testArr));
    }

    @Test
    public void test4() {
        int[] testArr = {1, -1, 1};
        Triangle testTr = new Triangle();
        Assert.assertNotEquals("Разносторонний", testTr.TypeOfTriangle(testArr), "Что-то пошло не так");
    }

    @Test
    public void test5() {
        int[] testArr = {2, 1, 1};
        Triangle testTr = new Triangle();
        Assert.assertEquals(testTr.TypeOfTriangle(testArr), "Треугольник не существует", "Что-то пошло не так");
    }

}
