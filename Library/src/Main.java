import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int temp;

        List<Book> books = new ArrayList<>();
        List<Person> people = new ArrayList<>();

        for (; ; ) {
            System.out.println("1.ثبت کتاب");
            System.out.println("2.ثبت اشخاص");
            System.out.println("3.خروج");
            num = input.nextInt();
            input.nextLine();

            switch (num) {
                case 1 -> {
                    Book book = new Book();

                    System.out.println("نام کتاب را وارد کنید: ");
                    book.setBookName(input.nextLine());

                    System.out.println("نام نویسنده را وارد کنید: ");
                    book.setAuthor(input.nextLine());

                    System.out.println("ژانر کتاب را انتخاب کنید:(1.درام 2.تاریخی 3.علمی) ");
                    temp = input.nextByte();
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
                        break;
                    }

                    System.out.println("آیدی کتاب را وارد کنید: ");
                    book.setBookId(input.nextInt());
                    input.nextLine();

                    books.add(book);

                    System.out.println("کتاب " + book.getBookName() + " با آیدی " + book.getBookId()
                            + " با ژانر  " + book.getGenre() + " ثبت شد. ");
                }
                case 2 -> {
                    Person person = new Person();

                    System.out.print("نام: ");
                    person.setfName(input.nextLine());

                    System.out.print("نام خانوادگی: ");
                    person.setlName(input.nextLine());

                    System.out.print("کد ملی: ");
                    person.setId(input.nextInt());

                    System.out.print("سن: ");
                    person.setAge(input.nextByte());

                    System.out.print("جنسیت عدد مورد نظر را انتخاب کنید(1.مرد 2.زن): ");
                    temp = input.nextInt();
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
                        break;
                    }

                    people.add(person);

                }
                case 3 -> {
                    return;
                }
                default -> System.out.println("عدد انتخابی اشتباه است دوباره تلاش کنید!!!");
            }
        }// unlimited for
    }
}