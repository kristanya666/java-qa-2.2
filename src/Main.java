public class Main {
    public static void main(String[] args) {
        int money = 1230;
        int bonus;
        int balance = 100;
        if (money>=1000) {
            bonus = money / 100;
            System.out.println("На счету всего: " + (bonus+money+balance));
            System.out.println("Бонусные рубли: " + bonus);

        } else {
            System.out.println("На счету всего: " + (money+balance));
            System.out.println("Бонусных рублей нет");
        }
    }
}
