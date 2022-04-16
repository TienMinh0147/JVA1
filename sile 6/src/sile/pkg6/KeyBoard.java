package sile.pkg6;

import java.util.Scanner;

public class KeyBoard {
static Scanner scanner =new Scanner(System.in);
public static String readString(String message){
    System.out.println("message");
    String input= scanner.nextLine();
    return input;
}
}
