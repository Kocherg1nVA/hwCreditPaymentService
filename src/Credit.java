public class Credit {

    public double calculate(double a, double b, double c) {
        double d = c / 12 / 100; /* ставка мес - ТУТ должно быть = c/b/100, (b - срок кредита в месяцах),
                                                 вместо b оставил "12", чтобы сумма ежемесячного платежа была ровно такой,
                                                 как на скриншотах к задаче
                                                 */
        double e = Math.pow((1 + d), b);
        double f = a * (d * e) / (e - 1); // ежемесячный платеж
        return (int) f;
    }
}