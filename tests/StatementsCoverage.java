import org.testng.Assert;
import org.testng.annotations.Test;

public class StatementsCoverage {

    @Test
    public void test3() {
        int[] testArr = {3, 3, 3};
        Triangle testTr = new Triangle();
        Assert.assertEquals(testTr.TypeOfTriangle(testArr), "Равносторонний");
    }

    @Test
    public void test1() {
        int[] testArr = {3, 4, 5};
        Triangle testTr = new Triangle();
        Assert.assertEquals(testTr.TypeOfTriangle(testArr), "Разносторонний");
    }
    @Test
    public void test2() {
        int[] testArr = {2, 3, 3};
        Triangle testTr = new Triangle();
        Assert.assertEquals(testTr.TypeOfTriangle(testArr), "Равнобедренный");
    }


    @Test
    public void test4() {
        int[] testArr = {1, -1, 1};
        Triangle testTr = new Triangle();
        Assert.assertEquals(testTr.TypeOfTriangle(testArr), "Треугольник не существует", "Что-то пошло не так");
    }
}
