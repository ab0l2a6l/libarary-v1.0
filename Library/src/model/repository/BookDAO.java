package model.repository;

import common.StaticProvider;
import model.entity.Book;
import model.entity.Genre;
import model.exceptions.Exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookDAO implements InterfaceDAO {
    @Override
    public void save() {
        Scanner input = StaticProvider.provideScanner();

        List<Book> books = new ArrayList<>();
        Book book = new Book();

        System.out.println("نام کتاب را وارد کنید: ");
        book.setName(input.nextLine());

        System.out.println("نام نویسنده را وارد کنید: ");
        book.setAuthor(input.nextLine());

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

        System.out.println("آیدی کتاب را وارد کنید: ");
        book.setId(input.nextInt());
        input.nextLine();

        books.add(book);

        System.out.println("کتاب " + book.getName() + " با آیدی " + book.getId()
                + " با ژانر  " + book.getGenre() + " ثبت شد. ");
    }
}
