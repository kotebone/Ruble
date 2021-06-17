public class Main {
    public static void main(String[] args) {
        int cashNow = 100;
        int cashDeposit = 900;
        int bonus = cashDeposit / 100;
        int balance = cashNow + cashDeposit + bonus;
        if (cashDeposit < 1000) {
            bonus = 0;
        }
        System.out.println("Итоговый баланс: " + balance + " Зачисленные бонусы: " + bonus);
    }
}