public class Main {
    public static void main(String[] args) {
        Credit service = new Credit();
        /*
        double a = 1_000_000.0; // сумма кредита
        double b = 12.0; // срок (мес)
        double c = 9.99; // ставка год
        int d = (int) service.calculate(a, b, c);
        System.out.println(d);
        */
        System.out.print("Ежемесячный платеж составляет: " + (int) service.calculate(1_000_000, 12, 9.99));
        System.out.println(" руб.");
        System.out.println();

        System.out.print("Ежемесячный платеж составляет: " + (int) service.calculate(1_000_000, 24, 9.99));
        System.out.println(" руб.");
        System.out.println();

        System.out.print("Ежемесячный платеж составляет: " + (int) service.calculate(1_000_000, 36, 9.99));
        System.out.println(" руб.");
        System.out.println();
    }
}