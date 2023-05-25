package model.exceptions;

public class Exceptions {

    public static void validateGenre(int temp) throws Exception {
        if (temp != 1 && temp != 2 && temp != 3)
            throw new Exception("اشتباه انتحاب کردید!!!");
    }

    public static void validateSexuality(int temp) throws Exception {
        if (temp != 1 && temp != 2)
            throw new Exception("اشتباه انتخاب کردید!!!");
    }

    public static void isKetabdar(int temp) throws Exception {
        if (temp != 2)
            throw new Exception("ارور!!!");
    }
}
