package validate;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    final static String EMAIL = "^([a-zA-Z0-9_\\.]+)@([a-zA-Z0-9_\\.]+)\\.([a-zA-Z]{2,5})$";
    final static String MOBILE = "^[0][1-9]\\d{9}$|^[1-9]\\d{9}$";
    public static String emailVal(String input) {
        String output = "";
        Pattern pattern = Pattern.compile(EMAIL);
        Matcher m = pattern.matcher(input);
        boolean result = m.matches();
        if (result) {
            output = input;
        } else {
            System.out.println("Invalid Email Address!\nRetry : ");
            Scanner scan = new Scanner(System.in);
            String newEmail = scan.next();
            String newResult = emailVal(newEmail);
            output = newResult;
        }
        return output;
    }

    public static String numberVal(String input) {
        String output = "";
        Pattern pattern = Pattern.compile(MOBILE);
        Matcher m = pattern.matcher(input);
        boolean result = m.matches();
        if (result) {
            output = input;
        } else {
            System.out.println("Invalid Contact Number!\nRetry : ");
            Scanner scan = new Scanner(System.in);
            String newMobile = scan.next();
            String newResult = numberVal(newMobile);
            output = newResult;
        }
        return output;
    }


}
