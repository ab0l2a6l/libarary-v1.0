package controller;

import common.StaticProvider;
import model.repository.BookDAO;
import model.repository.InterfaceDAO;
import model.repository.PersonDAO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int userRequestForPersonOrBook;
        InterfaceDAO interfaceDAO;

        for (; ; ) {
            userRequestForPersonOrBook = checkWhatUserWants();

            switch (userRequestForPersonOrBook) {
                case 1 -> {
                    interfaceDAO = new BookDAO();
                    interfaceDAO.save();
                    return;
                }
                case 2 -> {
                    interfaceDAO = new PersonDAO();
                    interfaceDAO.save();
                    return;
                }
                case 3 -> {
                    return;
                }
                default -> System.out.println("عدد انتخابی اشتباه است دوباره تلاش کنید!!!");
            }
        }
    }

    private static int checkWhatUserWants() {
        Scanner input = StaticProvider.provideScanner();
        int num;
        System.out.println("1.ثبت کتاب");
        System.out.println("2.ثبت اشخاص");
        System.out.println("3.خروج");
        num = input.nextInt();
        input.nextLine();
        return num;
    }
}