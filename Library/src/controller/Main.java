package controller;

import model.entity.Book;
import model.entity.Genre;
import model.entity.Person;
import model.entity.Sexuality;
import model.exceptions.Exceptions;
import model.repository.BookDAO;
import model.repository.InterfaceDAO;
import model.repository.PersonDAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        InterfaceDAO interfaceDAO;

        for (; ; ) {
            System.out.println("1.ثبت کتاب");
            System.out.println("2.ثبت اشخاص");
            System.out.println("3.خروج");
            num = input.nextInt();
            input.nextLine();

            switch (num) {
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
}