import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {


    private static void LimitedNumbers() {
        
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList<>();
        
        System.out.println("Input new numbers, will print out your strings when you enter a negative number");
        
        while(true) {
            int reply = scanner.nextInt();
            if (reply<0) {
                break;
            } else {
                list.add(reply);
            }
        }
        list.stream().filter(value -> value>1 && value<=5).
                forEach(System.out::println);

        LimitedNumbers();
    }

    
}
