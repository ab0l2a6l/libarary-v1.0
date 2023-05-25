package model.repository;

import common.StaticProvider;
import model.entity.Person;
import model.entity.Sexuality;
import model.exceptions.Exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonDAO implements InterfaceDAO {
    Scanner input = StaticProvider.provideScanner();
    Person person = new Person();
    List<Person> people = new ArrayList<>();
    @Override
    public void save() {
        getPersonNameFromUser();
        getLastNameFromUser();
        getIdFromUser();
        getAgeFromUser();
        getGenderFromUser();
        getRoleFromUser();
        persistPersonToList();
    }

    private void persistPersonToList() {
        people.add(person);
    }

    private void getRoleFromUser() {
        System.out.println("1.کتابدار\n2.مشتری");
        int temp = input.nextInt();
        try {
            Exceptions.isKetabdar(temp);
            System.out.println("اطلاعات شما ثبت شد.");
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }

    private void getGenderFromUser() {
        System.out.print("جنسیت عدد مورد نظر را انتخاب کنید(1.مرد 2.زن): ");
        int temp = input.nextInt();
        try {
            Exceptions.validateSexuality(temp);
            if (temp == 1)
                person.setSexuality(Sexuality.MALE);
            else if (temp == 2)
                person.setSexuality(Sexuality.FEMALE);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }

    private void getAgeFromUser() {
        System.out.print("سن: ");
        person.setAge(input.nextByte());
    }

    private void getIdFromUser() {
        System.out.print("کد ملی: ");
        person.setId(input.nextInt());
    }

    private void getLastNameFromUser() {
        System.out.print("نام خانوادگی: ");
        person.setlName(input.nextLine());
    }

    private void getPersonNameFromUser() {
        System.out.print("نام: ");
        person.setName(input.nextLine());
    }
}
