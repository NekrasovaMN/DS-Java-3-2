public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.87; //метр
        double weight = 98; // кг
        double bmi = service.calculate(weight, height);
        System.out.println("Body mass index = " + bmi);
    }
}
