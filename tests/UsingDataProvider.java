import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UsingDataProvider {
    @DataProvider(name = "test1")
    public Object[][] createData1() {
        return new Object[][]{
                {"Разносторонний", 3, 4, 5},
                {"Равнобедренный", 2, 4, 4},
                {"Равносторонний", 3, 3, 3},
                {"Треугольник не существует", 1, -1, 1},
                {"Треугольник не существует", 2, 1, 1}
        };
    }

    @Test(dataProvider = "test1")
    public void test(String res, int[] testArr) {
//        int[] testArr = {1, -1, 1};
        Triangle testTr = new Triangle();
        Assert.assertEquals(res, testTr.TypeOfTriangle(testArr), "Что-то пошло не так");
    }

}
