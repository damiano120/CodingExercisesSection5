public class AreaCalculator {

    // Program oblicza pole koła i prostokąta

    public static void main(String[] args) {

    }

    public static double area(double radius) {

        double invalid = -1.0;
        if (radius < 0)
            return invalid;

        return 3.14159 * radius * radius;

    }

    public static double area(double x, double y) {

        double invalid = -1.0;
        if (x < 0 || y < 0)
            return invalid;

        return x * y;

    }
}