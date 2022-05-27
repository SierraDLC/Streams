
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


public class AverageOfSelectedNumbers {
   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> numbers = new ArrayList<>();

        System.out.println("Enter a number");
        System.out.println("////////////////");
        System.out.println("Enter 'end' to stop the program");

        while (true) {
            String row = scan.nextLine();
            if (row.equals("end")) {
                break;
            }
        
            numbers.add(row);
        }

        double average = numbers.stream()
        .mapToInt(s -> Integer.valueOf(s))
        .average()
        .getAsDouble();


        System.out.println("Average number: " + average);
      

    }
}