
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class PrintingUserInput {

    private static void printingUserInputs() {
       
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> list = new ArrayList<>();
       
        System.out.println("Enter a new string. It will print out your strings if you enter nothing");
        
        while(true) {
            String reply = scanner.nextLine();
            if (reply.equals("")) {
                break;
            } else {
                list.add(reply);
            }
            list.forEach(System.out::println);
        }


           }}       