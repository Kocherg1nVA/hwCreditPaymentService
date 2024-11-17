public class Main {
    public static void main(String[] args) {
        Credit service = new Credit();

        System.out.println("Ежемесячный платеж составляет: " + service.calculate(1_000_000.0, 12.0, 9.99) + " руб.");
        System.out.println();

        System.out.println("Ежемесячный платеж составляет: " + service.calculate(1_000_000.0, 24.0, 9.99) + " руб.");
        System.out.println();

        System.out.println("Ежемесячный платеж составляет: " + service.calculate(1_000_000.0, 36.0, 9.99) + " руб.");
        System.out.println();
    }
}