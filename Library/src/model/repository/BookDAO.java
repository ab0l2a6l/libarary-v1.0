package model.repository;

import common.StaticProvider;
import model.entity.Book;
import model.entity.Genre;
import model.exceptions.Exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookDAO implements InterfaceDAO {
    Scanner input = StaticProvider.provideScanner();
    List<Book> books = new ArrayList<>();
    Book book = new Book();
    @Override
    public void save() {
        getBookNameFromUser();
        getAuthorFromUser();
        getGenreFromUser();
        getIdFromUser();
        saveToList();
        printResult();
    }

    private void saveToList() {
        books.add(book);
    }

    private void printResult() {
        System.out.println("کتاب " + book.getName() + " با آیدی " + book.getId()
                + " با ژانر  " + book.getGenre() + " ثبت شد. ");
    }

    private void getIdFromUser() {
        System.out.println("آیدی کتاب را وارد کنید: ");
        book.setId(input.nextInt());
        input.nextLine();
    }

    private void getGenreFromUser() {
        System.out.println("ژانر کتاب را انتخاب کنید:(1.درام 2.تاریخی 3.علمی) ");
        int temp = input.nextByte();
        input.nextLine();
        try {
            Exceptions.validateGenre(temp);
            if (temp == 1)
                book.setGenre(Genre.DRAM);
            else if (temp == 2)
                book.setGenre(Genre.HISTORICAL);
            else if (temp == 3)
                book.setGenre(Genre.SCIENCE);
        } catch (Exception e) // age temp 1 ya 2 ya 3 nabod exception part kon
        {
            System.out.println(e.getMessage());

        }
    }

    private void getAuthorFromUser() {
        System.out.println("نام نویسنده را وارد کنید: ");
        book.setAuthor(input.nextLine());
    }

    private void getBookNameFromUser() {
        System.out.println("نام کتاب را وارد کنید: ");
        book.setName(input.nextLine());
    }
}
