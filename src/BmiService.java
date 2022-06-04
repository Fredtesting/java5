public class BmiService {

    public double calculate(double height, int weight) {
        double height2 = height * height;
        double result = weight/height2;
        return result;
    }

}
