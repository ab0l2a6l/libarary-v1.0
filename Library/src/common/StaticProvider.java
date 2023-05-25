package common;

import java.util.Scanner;

public class StaticProvider {
    Scanner input = new Scanner(System.in);
    public static Scanner provideScanner(){
        Scanner input = new Scanner(System.in);
        return input;
    }
}
