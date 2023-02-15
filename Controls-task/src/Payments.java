import java.util.Scanner;

public class Payments {

    static double payCash;
    static double pay;
    static double payCard;
    static double payPal;


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите1 сумму оплаты USD ");
        payCash = Double.parseDouble(String.valueOf(scanner.nextDouble()));
        System.out.println("""
                Hello! My funny human
                Выберете вариант оплаты :
                1 - Оплата наличными
                2 - Оплата на расчетный счет
                3 - Оплата на карту""");

        pay = scanner.nextDouble();

        if (pay == 1) {
            System.out.printf("Оплата наличными1 USD %.2f ", payCash);
        } else if (pay == 2) {
            payPal = payCash + (payCash * 5 / 100);
            System.out.printf("Оплата на расчетный счет USD %.2f ", payPal);
        } else if (pay == 3) {
            payCard = payCash + (payCash * 2 / 100);
            System.out.printf("Оплата на карту USD %.2f ", payCard);
        } else {
            System.out.println("Unknown :/");
            scanner.close();
        }
    }
}