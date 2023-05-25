package model.repository;

import model.entity.Person;
import model.entity.Sexuality;
import model.exceptions.Exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonDAO implements InterfaceDAO {
    @Override
    public void save() {
        Scanner input = new Scanner(System.in);
        Person person = new Person();
        List<Person> people = new ArrayList<>();

        System.out.print("نام: ");
        person.setName(input.nextLine());

        System.out.print("نام خانوادگی: ");
        person.setlName(input.nextLine());

        System.out.print("کد ملی: ");
        person.setId(input.nextInt());

        System.out.print("سن: ");
        person.setAge(input.nextByte());

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
            break;
        }

        System.out.println("1.کتابدار\n2.مشتری");
        temp = input.nextInt();
        try {
            Exceptions.isKetabdar(temp);
            System.out.println("اطلاعات شما ثبت شد.");
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

        people.add(person);

    }
}
