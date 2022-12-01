public class Main {
    public static void main(String[] args) {

        int account = 1100;
        int payment = 1001;

        int bonus;
        if (payment >= 1001) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }

        //int bonus = payment <= 1000 ? 0 : payment / 100; aльтернативный вариант

        int balance = account + payment + bonus;

        System.out.println("Спасибо за пополнение! Ваш баланс: " + balance + " рублей");
        System.out.println("Вам начислено " + bonus + " бонусных рублей");
    }
}