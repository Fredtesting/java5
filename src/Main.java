public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double Bmi = service.calculate(1.70, 80);
        System.out.println(Bmi);
    }

}
