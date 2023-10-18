package ru.netology.javaqa;

public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        long amount = 10000;
        long bonus = service.calculate(amount); // должно получиться 500
        System.out.println(bonus);
    }
}