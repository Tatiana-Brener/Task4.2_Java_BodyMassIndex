public class Main {
    public static void main(String[] args) {

        BmiService bmiService = new BmiService();
        float bodyMassIndex = bmiService.calculate(67, 1.65f);
        System.out.println(bodyMassIndex);
    }
}
