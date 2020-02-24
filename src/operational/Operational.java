package operational;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Operational {
    public int run(){
        System.out.println("Welcome Your Contact List App\n" +
                "1.add a new contact\n" +
                "2.view all contacts\n" +
                "3.search for a contact\n" +
                "4.delete a contact\n" +
                "5.exit\n");
        System.out.print("INPUT : ");
        Scanner scan =new Scanner(System.in);
        int input;
        try{
            input=scan.nextInt();
            return input;
        }
        catch (InputMismatchException e){
            return -1;
        }
    }

}
