public class Credit {

    public double calculate(double a, double b, double c) {
        double d = c / 12 / 100; // ставка мес
        double e = Math.pow((1 + d), b);
        double f = a * (d * e) / (e - 1); // ежемесячный платеж
        return (int) f;
    }
}