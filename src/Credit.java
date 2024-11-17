public class Credit {

    public int calculate(double amount, double term, double rateYear) {
        double rateMonth = rateYear / 12 / 100;
        double payment = amount * (rateMonth * (Math.pow((1 + rateMonth), term))) / ((Math.pow((1 + rateMonth), term)) - 1);
        return (int) payment;
    }
}
/*
  amount - сумма кредита
  term - срок кредита
  rateYear - ставка год
  rateMonth - ставка  расчетная мес
  payment - платеж ежемесячный
 */