package validate;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    final static String EMAIL = "^([a-zA-Z0-9_\\.]+)@([a-zA-Z0-9_\\.]+)\\.([a-zA-Z]{2,5})$";

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

}
