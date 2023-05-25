import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //mamoolan intori nist. mamoolan har variable joda tarif mishe:
        int num;
        int temp;

        // book detail
//        List<Book> books = new ArrayList<>();
        Book[] books = new Book[10];
        int booksIndex = 0;
        String bookName;
        String author;
        int bookId;
        Genre genre = Genre.DRAM;

        //person detail
        Person[] people = new Person[10];
        int peopleIndex = 0;
        String FName;
        String LName;
        byte age;
        int personId;
        Sexuality sexuality = Sexuality.MALE;

        for (; ; ) {
            System.out.println("1.ثبت کتاب");
            System.out.println("2.ثبت اشخاص");
            System.out.println("3.خروج");
            num = input.nextInt();
            input.nextLine();

            switch (num) {
                case 1 -> {

                    System.out.println("نام کتاب را وارد کنید: ");
                    bookName = input.nextLine();
                    System.out.println("نام نویسنده را وارد کنید: ");
                    author = input.nextLine();
                    System.out.println("ژانر کتاب را انتخاب کنید:(1.درام 2.تاریخی 3.علمی) ");
                    temp = input.nextByte();
                    input.nextLine();

                    try {
                        Exceptions.validGenre(temp);
                        if (temp == 1)
                            genre = Genre.DRAM;
                        else if (temp == 2)
                            genre = Genre.HISTORICAL;
                        else if (temp == 3)
                            genre = Genre.SCIENCE;
                    } catch (Exception e) // age temp 1 ya 2 ya 3 nabod exception part kon
                    {
                        System.out.println(e.getMessage());
                        break;
                    }

                    System.out.println("آیدی کتاب را وارد کنید: ");
                    bookId = input.nextInt();
                    input.nextLine();

                    Book book = new Book();
                    book.setBookName(bookName);
                    book.setBookId(bookId);
                    book.setGenre(genre);
                    book.setAuthor(author);
                    books[booksIndex++] = book;

                    System.out.println("کتاب " + bookName + " با آیدی " + bookId
                            + " با ژانر  " + genre + " ثبت شد. ");
                }
                case 2 -> {

                    System.out.print("نام: ");
                    FName = input.nextLine();
                    System.out.print("نام خانوادگی: ");
                    LName = input.nextLine();
                    System.out.print("کد ملی: ");
                    personId = input.nextInt();
                    System.out.print("سن: ");
                    age = input.nextByte();
                    System.out.print("جنسیت عدد مورد نظر را انتخاب کنید(1.مرد 2.زن): ");
                    temp = input.nextInt();
                    input.nextLine();

                    try {
                        Exceptions.validSexuality(temp);
                        if (temp == 1)
                            sexuality = Sexuality.MALE;
                        else if (temp == 2)
                            sexuality = Sexuality.FEMALE;
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

                    Person person = new Person();
                    person.setfName(FName);
                    person.setlName(LName);
                    person.setId(personId);
                    person.setAge(age);
                    person.setSexuality(sexuality);
                    people[peopleIndex++] = person;

                }
                case 3 -> {
                    return;
                }
                default -> System.out.println("عدد انتخابی اشتباه است دوباره تلاش کنید!!!");
            }
        }// unlimited for
    }
}