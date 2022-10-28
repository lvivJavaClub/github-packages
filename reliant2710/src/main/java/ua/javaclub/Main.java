package ua.javaclub;

public class Main {
    public static void main(String[] args) {
        CalculatorService service = new CalculatorService();
        System.out.println(service.sum(2, 3));
        System.out.println(service.diff(12, 3));

    }
}