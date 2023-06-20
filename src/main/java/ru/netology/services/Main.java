package ru.netology.services;

public class Main {
    public static void main(String[] args) {
        RestTimeService service = new RestTimeService();

        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;

        int actual = service.calculate(income, expenses, threshold);
        System.out.println("Отдых " + actual);
    }
}
