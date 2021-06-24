public class Main {
    public static void main(String[] args) {
        int cashNow = 100;
        int cashDeposit = 900;
        int bonus;
        if (cashDeposit < 1000) {
            bonus = 0;
        }
            else {
                bonus = cashDeposit / 100;
        }
        int balance = cashNow + cashDeposit + bonus;
        System.out.println("Итоговый баланс: " + balance + " Зачисленные бонусы: " + bonus);
    }
}