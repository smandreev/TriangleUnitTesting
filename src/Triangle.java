/**
 * Created by Сергей on 05.03.2015.
 */


public class Triangle {

    String TypeOfTriangle(int[] sides) {
        String result = "Треугольник не треугольник";
        int a, b, c;
        boolean isTriangle = false;
        a = sides[0];
        b = sides[1];
        c = sides[2];

        for (int side : sides) {
            if (side <= 0) {
                result = "Треугольник не существует";
                return result;
            }
        }

        if ((a <= b + c) && (b <= a + c) && (a <= a + c)) {
            isTriangle = true;
        }

        if (isTriangle) {
            if ((sides[0] == sides[1]) && (sides[1] == sides[2])) {
                result = "Равносторонний";
            } else {
                if ((sides[0] != sides[1]) && (sides[0] != sides[2]) && (sides[1] != sides[2])) {
                    result = "Разносторонний";
                } else {
                    result = "Равнобедренный";
                }
            }
        }

        System.out.println("Стороны: " + a + " | " + b + " | " + c);
        System.out.println("Треугольник:" + result);
        return result;

    }
}
