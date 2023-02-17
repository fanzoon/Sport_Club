package org.example;

import java.util.Scanner;

public class Menu {

    public static void menu (){
        int menu;
        Scanner scanner = new Scanner(System.in);
        startMenu();
        do {
            menu = scanner.nextInt();
            switch (menu) {
                case 0 -> startMenu();
                case 1 -> {   // todu На сервисе вызвать всех спортсменов

                }
                case 2 -> {
                }
                case 3 -> System.out.println("Вы нажали 3");
                case 9 -> System.out.println("Выход из программы");
                default -> System.out.println("Выбрали несуществующий пункт меню");
            }
        } while (menu != 9);
    }

    private static void startMenu() {
        System.out.println("Меню программы:");
        System.out.println("Нажми 0, чтобы Вернуться в главное меню:");
        System.out.println("Нажми 1, чтобы получить всех спортсменов");
        System.out.println("Нажми 2, чтобы добавить спортсмена");
        System.out.println("Нажми 3, чтобы удалить спортсмена");
        System.out.println("Нажми 9, чтобы выйти из приложения");
    }
}
