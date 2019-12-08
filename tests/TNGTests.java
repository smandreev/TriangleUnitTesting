/**
 * Created by Сергей on 05.03.2015.
 */


import org.testng.Assert;
import org.testng.annotations.Test;

public class TNGTests {

    @Test
    public void test1() {
        int[] testArr = {3, 4, 5};
        Triangle testTr = new Triangle();
        Assert.assertEquals("Разносторонний", testTr.TypeOfTriangle(testArr));
    }

//    @Test
//    public void test5() {
//        int[] testArr = {-1, 2, 1};
//        Triangle testTr = new Triangle();
//        Assert.assertTrue("Треугольник не существует".equals(testTr.TypeOfTriangle(testArr)), "Что-то пошло не так");
//    }
//
//    @Test
//    public void test3() {
//        int[] testArr = {3, 3, 3};
//        Triangle testTr = new Triangle();
//        Assert.assertEquals("Равносторонний", testTr.TypeOfTriangle(testArr));
//    }
//
//    @Test
//    public void test2() {
//        int[] testArr = {2, 4, 4};
//        Triangle testTr = new Triangle();
//        Assert.assertEquals("Равнобедренный", testTr.TypeOfTriangle(testArr));
//    }


//    @Test
//    public void test4() {
//        int[] testArr = {1, -1, 1};
//        Triangle testTr = new Triangle();
//        Assert.assertFalse("Разносторонний".equals(testTr.TypeOfTriangle(testArr)), "Что-то пошло не так");
//    }
//
//    @Test
//    public void test5() {
//        int[] testArr = {1, 2, 1};
//        Triangle testTr = new Triangle();
//        Assert.assertTrue("Треугольник не существует".equals(testTr.TypeOfTriangle(testArr)), "Что-то пошло не так");
//    }

}
